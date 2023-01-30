package com.w2retrieval.starterproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Header {
    private String isLocalSystem;
    private String isTestSystem;
    private ReportInfo reportInfo;
    private ReportRunInfo reportRunInfo;
}
