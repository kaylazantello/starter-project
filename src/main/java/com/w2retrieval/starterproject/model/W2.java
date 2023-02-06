package com.w2retrieval.starterproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("paychexmock1")
@Setter
@Getter
@ToString
@AllArgsConstructor
public class W2 {
    @Id
    protected String id;
    protected String _class;
    protected Header header;
    protected Report report;
    protected ReportOptions reportOptions;
    
    public String getSSN() {
        return report.companies.company.employees.employee.get(0).basicEmployeeInfo.taxIdInfo.getSocialSecurityNumber();
    }
    public String getAdr1() {
        return report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeAddressInformation.getAddress1();
    }
    public String getCity() {
        String str = report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeAddressInformation.getAddress2();
        String delimSpace = " ";
        String[] arr1  = str.split(delimSpace);
        return arr1[0];
    }
    public String getState() {
        String str = report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeAddressInformation.getAddress2();
        String delimSpace = " ";
        String[] arr1  = str.split(delimSpace);
        return arr1[1];
    }
    public String getZip() {
        String str = report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeAddressInformation.getAddress2();
        String delimSpace = " ";
        String[] arr1  = str.split(delimSpace);
        return arr1[2];
    }
    public String getFirstName() {
        return report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeName.getFirstName();
    }
    public String getLastName() {
        return report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeName.getLastName();
    }
    public String getMiddleInt() {
        return report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeName.getMiddleInitial();
    }

    /*
    public String getWages() {
        return report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).stateInformation.get(0).localInformation.get(0).getLocalIncomeTax();
        //eeFormData.eeTaxData
        // stateInformation.get(0).localInformation.localWageTips()
    }
    public String getFedTaxWh() {
        return report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).getFederalIncomeTaxWithheld();
    }
    public String getSSWages(){
        return report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).getSocialSecurityWages();
    }
    public String getSSTaxWH(){
        return report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).getSocialSecurityTaxWithheld();
    }
    public String getMedCareWages(){
        return report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).getMedicareWagesAndTips();
    }
    public String getMedCareTaxWH(){
        return report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).getMedicareTaxWithheld();
    }
    public String getSSTips(){
        return report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).getSocialSecurityTips();
    }
     */
}

