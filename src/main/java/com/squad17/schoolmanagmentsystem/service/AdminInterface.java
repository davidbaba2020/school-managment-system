package com.squad17.schoolmanagmentsystem.service;


import com.squad17.schoolmanagmentsystem.models.Applicant;
import com.squad17.schoolmanagmentsystem.models.ReportSheet;
import com.squad17.schoolmanagmentsystem.models.School;

public interface AdminInterface {
    ReportSheet admissionProcessing(Applicant applicant, double cutOffMark, School school);
}
