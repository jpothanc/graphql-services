package com.ibit.repository;
import com.ibit.models.WebCounter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebCounterRepository extends JpaRepository<WebCounter, String>{
}
