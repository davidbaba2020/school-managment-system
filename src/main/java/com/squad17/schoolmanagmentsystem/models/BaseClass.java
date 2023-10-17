package com.squad17.schoolmanagmentsystem.models;


import com.squad17.schoolmanagmentsystem.enums.GENDER;
import com.squad17.schoolmanagmentsystem.enums.ROLE;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseClass {
    private int id;
    private String name;
    private String age;
    private GENDER gender;
    private String email;
    private ROLE role;
    private Date dateCreated = new Date();
}
