package com.w2retrieval.starterproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class BasicEmployeeInfo {
    private String deptNbr;
    private EmployeeAddressInformation employeeAddressInformation;
    private String employeeId;
    private EmployeeName employeeName;
    private String internalEmployeeNumber;
    private TaxIdInfo taxIdInfo;
    private String workerPk;
}
