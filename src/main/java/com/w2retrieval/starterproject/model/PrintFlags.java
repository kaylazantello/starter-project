package com.w2retrieval.starterproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class PrintFlags {
    private String printAgency;
    private String printAtVendor;
    private String printClient;
    private String printORS;
    private String suppressCoverTrailerPages;
}
