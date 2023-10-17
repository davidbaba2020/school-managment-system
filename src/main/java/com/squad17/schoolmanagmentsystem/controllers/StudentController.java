package com.squad17.schoolmanagmentsystem.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    @GetMapping("/test")
    public String testMyController() {
        return "Hur....raymmy api is working";
    }




}
