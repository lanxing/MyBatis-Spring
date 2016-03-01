package com.lanxing.serviceImp;

import com.lanxing.dao.TeacherMapper;
import com.lanxing.model.Teacher;
import com.lanxing.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lanxing on 16-3-1.
 */
@Service("teacherService")
public class TeacherServiceImp implements TeacherService {

    private TeacherMapper teacherMapper;

    public TeacherMapper getTeacherMapper() {
        return teacherMapper;
    }

    @Autowired
    public void setTeacherMapper(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    @Override
    public void insertTeacher(Teacher teacher) {
        teacherMapper.insertTeacher(teacher);
    }

    @Override
    public Teacher findTeacherById(String teacherId) {
        return teacherMapper.findTeacherById(teacherId);
    }

    @Override
    public List<Teacher> findAllTeachers() {
        return teacherMapper.findAllTeachers();
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        teacherMapper.updateTeacher(teacher);
    }

    @Override
    public Teacher findTeacherWithStudentsById(String teacherId) {
        return teacherMapper.findTeacherWithStudentsById(teacherId);
    }
}
