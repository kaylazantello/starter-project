package com.w2retrieval.starterproject.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.w2retrieval.starterproject.model.W2;

public interface W2Repository extends MongoRepository<W2, String> {

    @Query("{employeeSocialSecurityNumber:'?0'}")
    public W2 findByEmployeeSocialSecurityNumber(String employeeSocialSecurityNumber);

    @Query(value="{employerAddressState:'?0'}", fields="{'employerIdNo' : 1, 'employerName' : 1}")
    public List<W2> findEmployerByState(String employerAddressState);

    @Query("{employerAddressState: '?0'}")
    public List<W2> findByEmployerAddressState(String employerAddressState);

    @Query(value="{employeeSocialSecurityNumber:'?0'}", fields="{'employerName' : 1, 'employeeName' : 1, 'wagesTipsOtherComp' : 1}")
    public W2 findEmployeeBySSN(String employeeSocialSecurityNumber);

    //@Query("{id: '?0'}")
    //W2 findById(String id);

    public long count();
}

