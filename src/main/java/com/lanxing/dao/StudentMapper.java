package com.lanxing.dao;

import com.lanxing.model.Student;

import java.util.List;

/**
 * Created by lanxing on 16-2-26.
 */
public interface StudentMapper {
    void insertStudent(Student student);
    Student findStudentById(String studentId);
    List<Student> findAllStudents();
    List<Student> findStudentsByGrade(int studentGrade);
    List<Student> findStudentByDegree(int studentDegree);
    void updateStudent(Student student);
    void deleStudentById(String studentId);
}
