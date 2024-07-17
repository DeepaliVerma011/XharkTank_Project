package com.example.XharkTank.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "pitches")
public class Pitch {
    @Id
    private String id;
    private String entrepreneur;
    private String pitchTitle;
    private String pitchDescription;
    private double askAmount;
    private double equityPercentage;
    private double offerAmount;
}
