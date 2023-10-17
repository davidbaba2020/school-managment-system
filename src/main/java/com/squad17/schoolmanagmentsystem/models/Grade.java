package com.squad17.schoolmanagmentsystem.models;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Grade {
    private int id;
    private String name;
    private String formTeacherName;
    private String session;
    private List<Student> classMembers;
}
