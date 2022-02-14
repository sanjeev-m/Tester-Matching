package com.example.testermatching.repository;

import com.example.testermatching.entity.Tester;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface TesterRepository extends CrudRepository<Tester, BigDecimal> {
//    List<String> findDistinctByCountryOrderByCountryAsc();
    @Query("select distinct country from Tester order by country asc")
    List<String> findAllDistinctCountries();
}