package com.w2retrieval.starterproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class ClientInformation {
    private AddressInformation addressInformation;
    private String branchNumber;
    private String clientNumber;
    private String companyName;
    private String consolidatedClientInd;
    private String contactEmail;
    private PreparerInformation preparerInformation;

//    @AllArgsConstructor
//    @Setter
//    @Getter
//    @ToString
//    public class TaxIdInfo {
//        private String einNumber;
//    }
    private String w2DeliveryCode;
    private W2MailingAddress w2MailingAddress;
}
