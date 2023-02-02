package com.w2retrieval.starterproject.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.w2retrieval.starterproject.model.W2;
import com.w2retrieval.starterproject.model.ReportRunInfo;

public interface W2Repository extends MongoRepository<W2, String> {

    @Query("{'report.companies.company.employees.employee.basicEmployeeInfo.taxIdInfo.socialSecurityNumber': ?0}")
    public W2 findBySocialSecurityNumber(String socialSecurityNumber);

    @Query("{'header.reportRunInfo.runDate': ?0}")
    public ReportRunInfo findByRunDate(String runDate);

    public long count();
}

