package com.squad17.schoolmanagmentsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EntranceSubjects {
    private Long id;
    private double englishScore;
    private double mathematicsScore;
    private double biologyScore;
    private double totalEntranceScore;
}
