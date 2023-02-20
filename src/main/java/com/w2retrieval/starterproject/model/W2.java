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
    //protected String _class;
    //protected Header header;
    //protected Report report;
    //protected ReportOptions reportOptions;

    protected ReportDefinition reportDefinition;

    public String getFEID() {
        return reportDefinition.report.companies.company.clientInformation.taxIdInfoClientInfo.getEinNumber();
    }

    public String getName1() {
        return reportDefinition.report.companies.company.clientInformation.getCompanyName();
    }

    public String getAddr1() {
        return reportDefinition.report.companies.company.clientInformation.addressInformation.getStreet();
    }

    public String getEmployerCity() {
        return reportDefinition.report.companies.company.clientInformation.addressInformation.getLocality();
    }

    public String getEmployerState() {
        return reportDefinition.report.companies.company.clientInformation.addressInformation.getRegion();
    }

    public String getEmployerPostal() {
        return reportDefinition.report.companies.company.clientInformation.addressInformation.getPostalCode();
    }
    public String getSSN() {
        return reportDefinition.report.companies.company.employees.employee.get(0).basicEmployeeInfo.taxIdInfo.getSocialSecurityNumber();
    }
    public String getAdr1() {
        return reportDefinition.report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeAddressInformation.getAddress1();
    }
    public String getCity() {
        String str = reportDefinition.report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeAddressInformation.getAddress2();
        String delimSpace = " ";
        String[] arr1  = str.split(delimSpace);
        return arr1[0];
    }
    public String getState() {
        String str = reportDefinition.report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeAddressInformation.getAddress2();
        String delimSpace = " ";
        String[] arr1  = str.split(delimSpace);
        return arr1[1];
    }
    public String getZip() {
        String str = reportDefinition.report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeAddressInformation.getAddress2();
        String delimSpace = " ";
        String[] arr1  = str.split(delimSpace);
        return arr1[2];
    }
    public String getFirstName() {
        return reportDefinition.report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeName.getFirstName();
    }
    public String getLastName() {
        return reportDefinition.report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeName.getLastName();
    }
    public String getMiddleInt() {
        return reportDefinition.report.companies.company.employees.employee.get(0).basicEmployeeInfo.employeeName.getMiddleInitial();
    }


    public String getWages() {
        return reportDefinition.report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).getWagesTipsOtherCompensation();
    }

    public String getFedTaxWh() {
        return reportDefinition.report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).getFederalIncomeTaxWithheld();
    }

    public String getSSWages(){
        return reportDefinition.report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).getSocialSecurityWages();
    }
    public String getSSTaxWH(){
        return reportDefinition.report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).getSocialSecurityTaxWithheld();
    }
    public String getMedCareWages(){
        return reportDefinition.report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).getMedicareWagesAndTips();
    }
    public String getMedCareTaxWH(){
        return reportDefinition.report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).getMedicareTaxWithheld();
    }
    public String getSSTips(){
        return reportDefinition.report.companies.company.employees.employee.get(0).eeFormData.eeTaxData.get(0).getSocialSecurityTips();
    }

}

