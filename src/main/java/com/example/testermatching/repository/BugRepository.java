package com.example.testermatching.repository;

import com.example.testermatching.entity.Bug;
import com.example.testermatching.model.TesterMatchResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BugRepository extends CrudRepository<Bug, Long> {
    @Query("select new com.example.testermatching.model.TesterMatchResponse( count(b.id), b.device.id, b.device.description, " +
            " b.tester.id, b.tester.firstName, b.tester.lastName, b.tester.country) from Bug b  " +
            " where b.tester.country in (:countries) and b.device.id in (:deviceIds) " +
            "group by b.device.id, b.device.description, b.tester.id, b.tester.firstName, b.tester.lastName, b.tester.country " +
            " order by b.tester.id, b.device.description ")
    List<TesterMatchResponse> findAllBugs(@Param("countries") List<String> countries, @Param("deviceIds") List<Long> deviceIds);
}