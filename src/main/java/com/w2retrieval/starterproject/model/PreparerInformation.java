package com.w2retrieval.starterproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class PreparerInformation {
    private String officerName;
    private String officerTitle;
    private PhoneNumber phoneNumber;
    private String preparerEin;
    private String preparerName;
    private String preparerProduct;
    private ReferenceCopyText referenceCopyText;
    private String signaturePath;
}
