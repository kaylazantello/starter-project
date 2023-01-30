package com.w2retrieval.starterproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class LocalInformation {
    private String localIncomeTax;
    private String localName;
    private String localWageTips;
    private String pennsylvaniaLiveSchoolDistrictCode;
    private String pennsylvaniaSchoolDistrictCode;
}
