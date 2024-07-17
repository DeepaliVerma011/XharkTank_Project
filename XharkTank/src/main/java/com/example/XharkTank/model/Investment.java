package com.example.XharkTank.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "investments")
public class Investment {
    @Id
    private String id;
    private String pitchId;
    private String investorName;
    private double investmentAmount;
    private double equityOffered;
}
