package com.ibit.repository;

import com.ibit.models.Equity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface EquityRepository extends JpaRepository<Equity, Long>, QuerydslPredicateExecutor<Equity> {
}