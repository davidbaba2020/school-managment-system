package com.squad17.schoolmanagmentsystem.models;

import lombok.*;

import java.util.Date;
import java.util.Map;


@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReportSheet {
    private String name;
    private Date date = new Date();
    private String studentLevel;
    private Map<String , Double> subjectsSatFor;
    private double averageScore;
    private String teachersRemark;
    private char grade;
}
