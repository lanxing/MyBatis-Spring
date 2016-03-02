package com.lanxing.controller;

import com.lanxing.model.Student;
import com.lanxing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lanxing on 16-3-2.
 */

@Controller
@RequestMapping("/student")
public class StudentController {

    private StudentService studentService;

    public StudentService getStudentService() {
        return studentService;
    }

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/getStudentById")
    public String getStudentById(String id, HttpServletRequest request){

        Student stu = studentService.findStudentById(id);
        request.setAttribute("student", stu);

        return "showStudent";
    }
}
