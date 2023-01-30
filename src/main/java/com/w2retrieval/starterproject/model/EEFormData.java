package com.w2retrieval.starterproject.model;
import java.util.List;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class EEFormData {
    private ArrayList<EETaxData> eeTaxData;
}
