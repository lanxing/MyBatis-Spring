package com.lanxing.serviceImp;

import com.lanxing.dao.StudentMapper;
import com.lanxing.model.Student;
import com.lanxing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lanxing on 16-3-1.
 */

@Service("studentService")
public class StudentServiceImp implements StudentService {

    private StudentMapper studentMapper;

    public StudentMapper getStudentMapper() {
        return studentMapper;
    }

    @Autowired
    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public void insertStudent(Student student) {
        studentMapper.insertStudent(student);
    }

    @Override
    public Student findStudentById(String studentId) {
        return studentMapper.findStudentById(studentId);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentMapper.findAllStudents();
    }

    @Override
    public List<Student> findStudentsByGrade(int studentGrade) {
        return studentMapper.findStudentsByGrade(studentGrade);
    }

    @Override
    public List<Student> findStudentByDegree(int studentDegree) {
        return studentMapper.findStudentByDegree(studentDegree);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }

    @Override
    public void deleStudentById(String studentId) {
        studentMapper.deleStudentById(studentId);
    }
}
