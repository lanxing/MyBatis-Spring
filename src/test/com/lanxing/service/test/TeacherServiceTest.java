package com.lanxing.service.test;

import com.lanxing.model.Teacher;
import com.lanxing.service.TeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by lanxing on 16-3-1.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TeacherServiceTest {

    private TeacherService teacherService;

    public TeacherService getTeacherService() {
        return teacherService;
    }

    @Autowired
    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Test
    public void findAllTeacher(){
        List<Teacher> teacherList = teacherService.findAllTeachers();
        for (Teacher teacher:teacherList) {
            System.out.println(teacher);
        }
    }
}
