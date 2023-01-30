package com.w2retrieval.starterproject.model;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Employees {
    private ArrayList<Employee> employee;
}
