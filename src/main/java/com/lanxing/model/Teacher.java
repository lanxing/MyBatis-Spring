package com.lanxing.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lanxing on 16-2-26.
 */
public class Teacher implements Serializable{
    private String teacherId;
    private String teacherPassword;
    private String teacherName;
    private String teacherPhone;
    private String teacherMail;
    private String teacherContent;
    private Integer teacherProfessor;
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherPhone() {
        return teacherPhone;
    }

    public void setTeacherPhone(String teacherPhone) {
        this.teacherPhone = teacherPhone;
    }

    public String getTeacherMail() {
        return teacherMail;
    }

    public void setTeacherMail(String teacherMail) {
        this.teacherMail = teacherMail;
    }

    public String getTeacherContent() {
        return teacherContent;
    }

    public void setTeacherContent(String teacherContent) {
        this.teacherContent = teacherContent;
    }

    public Integer getTeacherProfessor() {
        return teacherProfessor;
    }

    public void setTeacherProfessor(Integer teacherProfessor) {
        this.teacherProfessor = teacherProfessor;
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId='" + teacherId + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", teacherPhone='" + teacherPhone + '\'' +
                ", teacherMail='" + teacherMail + '\'' +
                ", teacherContent='" + teacherContent + '\'' +
                ", teacherProfessor=" + teacherProfessor +
                ", students=" + students +
                '}';
    }
}
