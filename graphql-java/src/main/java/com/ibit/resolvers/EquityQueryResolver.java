package com.ibit.resolvers;

import com.ibit.models.Equity;
import com.ibit.models.QEquity;
import com.ibit.repository.EquityRepository;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import graphql.kickstart.tools.GraphQLQueryResolver;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class EquityQueryResolver implements GraphQLQueryResolver {
    EquityRepository equityRepository;
    private JPAQueryFactory queryFactory;

    @Autowired
    public EquityQueryResolver(EquityRepository equityRepository, EntityManager entityManager) {
        this.equityRepository = equityRepository;
        this.queryFactory = new JPAQueryFactory(entityManager);
    }
    public Optional<Equity> findEquityByCode(String code) {
        QEquity qEquity = QEquity.equity;
        BooleanBuilder builder = new BooleanBuilder();
        builder.and(qEquity.productCode.eq(code));
        return this.equityRepository.findOne(builder);
    }
    public Iterable<Equity> findEquityByName(String stockName) {
        QEquity qEquity = QEquity.equity;
        BooleanBuilder builder = new BooleanBuilder();
        builder.and(qEquity.stockName.contains(stockName));
        return this.equityRepository.findAll(builder);
    }

}
