package com.squad17.schoolmanagmentsystem.models;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Applicant extends BaseClass{
    private List<EntranceSubjects> entranceSubjectsList;
    private Double averageEntranceScore;
    private String levelAppliedFor;
    private char grade;
    private ReportSheet entranceExamsResult;
}
