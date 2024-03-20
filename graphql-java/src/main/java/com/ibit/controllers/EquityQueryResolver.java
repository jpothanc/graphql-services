package com.ibit.controllers;

import com.ibit.models.Equity;
import com.ibit.repository.EquityRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class EquityQueryResolver implements GraphQLQueryResolver {

    EquityRepository equityRepository;
    @Autowired
    public EquityQueryResolver(EquityRepository equityRepository) {
        this.equityRepository = equityRepository;
    }
    public Optional<Equity> findEquityByCode(String code) {
        return this.equityRepository.findById(code);
    }
}
