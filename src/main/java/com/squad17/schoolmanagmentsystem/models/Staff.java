package com.squad17.schoolmanagmentsystem.models;

import com.squad17.schoolmanagmentsystem.enums.CATEGORY;
import com.squad17.schoolmanagmentsystem.enums.ROLE;
import com.squad17.schoolmanagmentsystem.exceptions.UnauthorizedException;
import com.squad17.schoolmanagmentsystem.service.AdminInterface;
import lombok.*;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Staff extends BaseClass implements AdminInterface {
    private String staffRegNo;
    private CATEGORY category;

    @Override
    public ReportSheet admissionProcessing(Applicant applicant, double cutOffMark, School school) {

        List<Student> schoolStudentList = school.getStudentInThisSchool();

        ReportSheet reportSheet = new ReportSheet();
                    reportSheet.setName(applicant.getName());
                    reportSheet.setSubjectsSatFor(new HashMap<>());
                    reportSheet.setGrade(applicant.getGrade());
                    reportSheet.setAverageScore(applicant.getAverageEntranceScore());
        //1.
        if(this.getRole()!= ROLE.ADMIN_OFFICER && this.getRole()!=ROLE.PRINCIPAL) {
            throw new UnauthorizedException("You don't have this right");
        }

        //2.
        double applicantsAverageScore = applicant.getAverageEntranceScore();
        if(applicantsAverageScore < cutOffMark) {
            //3.
            reportSheet.setTeachersRemark("Sorry you did not make it, try again latter");
            reportSheet.setStudentLevel("NOT ADMITTED");
        }
            reportSheet.setTeachersRemark("Congratulations!!! You have been place in "+ "Glade ...");
            reportSheet.setStudentLevel("You have been admitted to "+applicant.getLevelAppliedFor());

            //4.
            Student newStudent = new Student();
                    newStudent.setName(applicant.getName());
                    newStudent.setAge(applicant.getAge());
                    newStudent.setGender(applicant.getGender());

            schoolStudentList.add(newStudent);

        return reportSheet;
    }

    //Implementation steps
//    1. Check if the staff has the right to admit the student
//    2. Applicant should have an average score of 50%
//    3. If not successful report sheet stating so should be created and all performance record
//    4. Placed in a (Added to the class list) class by being offered admission on his/her report sheet and added to the s school student list
//    5. Subjects being allocated to the student

}
