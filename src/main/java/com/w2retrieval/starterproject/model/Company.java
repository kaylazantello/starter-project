package com.w2retrieval.starterproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Company {
    private ClientInformation clientInformation;
    private Dates dates;
    private Employees employees;
    private Indicators indicators;
    private PrintFlags printFlags;
}
