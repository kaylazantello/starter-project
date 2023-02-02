package com.w2retrieval.starterproject.model;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class EETaxData {
    private String allocatedTips;
    private List<Box14> box14;
    private String dependentCareBenefits;
    private String federalIncomeTaxWithheld;
    private String medicareTaxWithheld;
    private String medicareWagesAndTips;
    private String msg;
    private String nonQualifiedPlans;
    private String retirementIndicator;
    private String socialSecurityTaxWithheld;
    private String socialSecurityTips;
    private String socialSecurityWages;
    private List<StateInformation> stateInformation;
    private String statutoryIndicator;
    private String thirdPartySickIndicator;
    private String w2PrintIndicator;
    private String wagesTipsOtherCompensation;
}
