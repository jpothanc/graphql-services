package com.ibit.repository;

import com.ibit.models.Equity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquityRepository extends JpaRepository<Equity, String> {
}
