package com.lanxing.service.test;

import com.lanxing.model.Student;
import com.lanxing.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by lanxing on 16-3-1.
 */

@RunWith(SpringJUnit4ClassRunner.class)   //相当于继承了SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class StudentServiceTest {
    private StudentService studentService;

    public StudentService getStudentService() {
        return studentService;
    }

    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @Test
    public void findAllStudents(){
        List<Student> stus = studentService.findAllStudents();
        for (Student stu:stus) {
            System.out.println(stu);
        }
    }
}
