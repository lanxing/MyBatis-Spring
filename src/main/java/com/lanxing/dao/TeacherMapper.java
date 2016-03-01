package com.lanxing.dao;

import com.lanxing.model.Teacher;

import java.util.List;

/**
 * Created by lanxing on 16-2-26.
 */
public interface TeacherMapper {
    void insertTeacher(Teacher teacher);
    Teacher findTeacherById(String teacherId);
    List<Teacher> findAllTeachers();
    void updateTeacher(Teacher teacher);
    Teacher findTeacherWithStudentsById(String teacherId);
}
