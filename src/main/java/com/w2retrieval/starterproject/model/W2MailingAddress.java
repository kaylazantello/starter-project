package com.w2retrieval.starterproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class W2MailingAddress {
    private String country;
    private String countryCode;
    private String extended;
    private String foreignAddressIndicator;
    private String locality;
    private String mailingName;
    private String postalCode;
    private String region;
    private String street;
}
