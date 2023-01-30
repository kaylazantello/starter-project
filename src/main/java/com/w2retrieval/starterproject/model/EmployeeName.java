package com.w2retrieval.starterproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class EmployeeName {
    private String firstName;
    private String fullName;
    private String lastName;
    private String middleInitial;
}
