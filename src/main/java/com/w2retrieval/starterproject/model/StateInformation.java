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
public class StateInformation {
    private List<LocalInformation> localInformation;
    private String stateAbbreviation;
    private String stateIdNumber;
    private String stateIncomeTax;
    private String stateWagesTips;
}
