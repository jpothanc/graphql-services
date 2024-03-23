package com.ibit.resolvers;

import com.ibit.models.Equity;
import com.ibit.models.EquityInput;
import com.ibit.repository.EquityRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class EquityMutationResolver implements GraphQLMutationResolver {
    EquityRepository equityRepository;
    public EquityMutationResolver(EquityRepository equityRepository) {
        this.equityRepository = equityRepository;
    }
    public Equity saveEquity(EquityInput input) {
        Equity equity = convertToEquity(input);
        return this.equityRepository.save(equity);
    }
    public Equity convertToEquity(EquityInput input) {
        Equity equity = new Equity();
        equity.setProductCode(input.getProductCode());
        equity.setStockName(input.getStockName());
        equity.setPrimaryExchange(input.getPrimaryExchange());
        equity.setLotSize(input.getLotSize());
        equity.setLastClosePrice(input.getLastClosePrice());
        equity.setCurrency(input.getCurrency());
        equity.setDay20AverageVolume(input.getDay20AverageVolume());
        equity.setDay30AverageVolume(input.getDay30AverageVolume());
        return equity;
    }
}
