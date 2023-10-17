package com.squad17.schoolmanagmentsystem.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BaseClass{
    private String regNumber;
    private String level;
    private List<Subjects> subjectsOffering;
    private int strike;
}
