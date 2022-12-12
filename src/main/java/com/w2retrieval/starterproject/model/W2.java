package com.w2retrieval.starterproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("mockdata1")
@AllArgsConstructor
public class W2 {
    @Id
    @Setter @Getter private String id;
    @Setter @Getter private	String employerIdNo;
    @Setter @Getter private	String employerName;
    @Setter @Getter private	String employerAddressLine1;
    @Setter @Getter private	String employerCityStateZip;
    @Setter @Getter private	String employerAddressCity;
    @Setter @Getter private	String employerAddressState;
    @Setter @Getter private	String employerAddressZip;
    @Setter @Getter private	String employeeSocialSecurityNumber;
    @Setter @Getter private	String employeeName;
    @Setter @Getter private	String employeeAddressLine1;
    @Setter @Getter private	String employeeCityStateZip;
    @Setter @Getter private	String employeeAddressCity;
    @Setter @Getter private	String employeeAddressState;
    @Setter @Getter private	String employeeAddressZip;
    @Setter @Getter private	int controlNumber;
    @Setter @Getter private	double wagesTipsOtherComp;
    @Setter @Getter private	double federalIncomeTaxWithheld;
    @Setter @Getter private	double socialSecurityWages;
    @Setter @Getter private	double socialSecurityTaxWithheld;
    @Setter @Getter private	double medicareWagesAndTips;
    @Setter @Getter private	double medicareTaxWithheld;
    @Setter @Getter private	double socialSecurityTips;
    @Setter @Getter private	double allocatedTips;
    @Setter @Getter private	int dependentCareBenefits;
    @Setter @Getter private	int	nonqualifiedPlans;
    @Setter @Getter private	int	box12aAmount;
    @Setter @Getter private	String box12bCode;
    @Setter @Getter private	int	box12bAmount;
    @Setter @Getter private	String box12cCode;
    @Setter @Getter private	int	box12cAmount;
    @Setter @Getter private	int	box12dAmount;
    @Setter @Getter private	String retirementPlan;
    @Setter @Getter private	String thirdPartySickPay;
    @Setter @Getter private	String statePrimary;
    @Setter @Getter private	String employerStateIdNumberPrimary;
    @Setter @Getter private	double stateWagesTipsPrimary;
    @Setter @Getter private	double stateIncomeTaxPrimary;
    @Setter @Getter private	double localWagesTipsPrimary;
    @Setter @Getter private	double localIncomeTaxPrimary;
    @Setter @Getter private	String localityNamePrimary;
    @Setter @Getter private	String stateSecondary;
    @Setter @Getter private	String employerStateIdNumberSecondary;
    @Setter @Getter private	double stateWagesTipsSecondary;
    @Setter @Getter private	double stateIncomeTaxSecondary;
    @Setter @Getter private	double localWagesTipsSecondary;
    @Setter @Getter private	double localIncomeTaxSecondary;
    @Setter @Getter private	String localityNameSecondary;
    @Setter @Getter private	String box12aCode;
    @Setter @Getter private	String box12dCode;
    @Setter @Getter private	String statutoryEmployee;

    @Override
    public String toString() {
        return "WageAndTaxStatement\nid: " + id + "\nemployerIdNo: " + employerIdNo + "\nemployerName: " + employerName
                + "\nemployerAddressLine1: " + employerAddressLine1 + "\nemployerCityStateZip: " + employerCityStateZip
                + "\nemployerAddressCity: " + employerAddressCity + "\nemployerAddressState: " + employerAddressState
                + "\nemployerAddressZip: " + employerAddressZip + "\nemployeeSocialSecurityNumber: "
                + employeeSocialSecurityNumber + "\nemployeeName: " + employeeName + "\nemployeeAddressLine1: "
                + employeeAddressLine1 + "\nemployeeCityStateZip: " + employeeCityStateZip + "\nemployeeAddressCity: "
                + employeeAddressCity + "\nemployeeAddressState: " + employeeAddressState + "\nemployeeAddressZip: "
                + employeeAddressZip + "\ncontrolNumber: " + controlNumber + "\nwagesTipsOtherComp: " + wagesTipsOtherComp
                + "\nfederalIncomeTaxWithheld: " + federalIncomeTaxWithheld + "\nsocialSecurityWages: "
                + socialSecurityWages + "\nsocialSecurityTaxWithheld: " + socialSecurityTaxWithheld
                + "\nmedicareWagesAndTips: " + medicareWagesAndTips + "\nmedicareTaxWithheld: " + medicareTaxWithheld
                + "\nsocialSecurityTips: " + socialSecurityTips + "\nallocatedTips: " + allocatedTips
                + "\ndependentCareBenefits: " + dependentCareBenefits + "\nnonqualifiedPlans: " + nonqualifiedPlans
                + "\nbox12aAmount: " + box12aAmount + "\nbox12bCode: " + box12bCode + "\nbox12bAmount: " + box12bAmount
                + "\nbox12cCode: " + box12cCode + "\nbox12cAmount: " + box12cAmount + "\nbox12dAmount: " + box12dAmount
                + "\nretirementPlan: " + retirementPlan + "\nthirdPartySickPay: " + thirdPartySickPay + "\nstatePrimary: "
                + statePrimary + "\nemployerStateIdNumberPrimary: " + employerStateIdNumberPrimary
                + "\nstateWagesTipsPrimary: " + stateWagesTipsPrimary + "\nstateIncomeTaxPrimary: "
                + stateIncomeTaxPrimary + "\nlocalWagesTipsPrimary: " + localWagesTipsPrimary
                + "\nlocalIncomeTaxPrimary: " + localIncomeTaxPrimary + "\nlocalityNamePrimary: " + localityNamePrimary
                + "\nstateSecondary: " + stateSecondary + "\nemployerStateIdNumberSecondary: "
                + employerStateIdNumberSecondary + "\nstateWagesTipsSecondary: " + stateWagesTipsSecondary
                + "\nstateIncomeTaxSecondary: " + stateIncomeTaxSecondary + "\nlocalWagesTipsSecondary: "
                + localWagesTipsSecondary + "\nlocalIncomeTaxSecondary: " + localIncomeTaxSecondary
                + "\nlocalityNameSecondary: " + localityNameSecondary + "\nbox12aCode: " + box12aCode + "\nbox12dCode: "
                + box12dCode + "\nstatutoryEmployee: " + statutoryEmployee + "\n";
    }
}

