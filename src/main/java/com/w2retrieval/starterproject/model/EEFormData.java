package com.w2retrieval.starterproject.model;
import java.util.List;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class EEFormData {
    //@Field(targetType = FieldType.ARRAY)
    private List<EETaxData> eeTaxData;
}
