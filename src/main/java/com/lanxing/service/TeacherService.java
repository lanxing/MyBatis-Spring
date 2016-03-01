package com.lanxing.service;

import com.lanxing.model.Teacher;

import java.util.List;

/**
 * Created by lanxing on 16-3-1.
 */
public interface TeacherService {
    void insertTeacher(Teacher teacher);
    Teacher findTeacherById(String teacherId);
    List<Teacher> findAllTeachers();
    void updateTeacher(Teacher teacher);
    Teacher findTeacherWithStudentsById(String teacherId);
}
