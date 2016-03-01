package com.lanxing.service.test;

import com.lanxing.model.Student;
import com.lanxing.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by lanxing on 16-3-1.
 */
public class StudentServiceTest {
    private StudentService studentService;

    @Before
    public void initlize(){
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml", "spring-mybatis.xml"});
        studentService = (StudentService) ac.getBean("studentService");
    }

    @Test
    public void findAllStudents(){
        List<Student> stus = studentService.findAllStudents();
        for (Student stu:stus) {
            System.out.println(stu);
        }
    }
}
