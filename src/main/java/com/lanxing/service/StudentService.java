package com.lanxing.service;

import com.lanxing.model.Student;

import java.util.List;

/**
 * Created by lanxing on 16-3-1.
 */
public interface StudentService {

    void insertStudent(Student student);
    Student findStudentById(String studentId);
    List<Student> findAllStudents();
    List<Student> findStudentsByGrade(int studentGrade);
    List<Student> findStudentByDegree(int studentDegree);
    void updateStudent(Student student);
    void deleStudentById(String studentId);
}
