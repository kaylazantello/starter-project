package com.w2retrieval.starterproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("paychexmocktest2")
@Setter
@Getter
@ToString
@AllArgsConstructor
public class W2 {
    @Id
    private String _class;
    private Header header;
    private Report report;
    private ReportOptions reportOptions;
}

