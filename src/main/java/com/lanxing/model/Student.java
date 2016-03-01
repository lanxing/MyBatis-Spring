package com.lanxing.model;

/**
 * Created by lanxing on 16-2-26.
 */
public class Student {
    private String stuId;
    private String stuName;
    private String stuPhone;
    private String stuMail;
    private String stuQQ;
    private String stuWechart;
    private String stuPassword;
    private Integer stuGrade = 0;
    private Integer stuDegree = 0;
    private Integer stuAge = 0;
    private Integer stuSex = 0;
    private Teacher teacher;
    private Integer status = 1;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuPhone() {
        return stuPhone;
    }

    public void setStuPhone(String stuPhone) {
        this.stuPhone = stuPhone;
    }

    public String getStuMail() {
        return stuMail;
    }

    public void setStuMail(String stuMail) {
        this.stuMail = stuMail;
    }

    public String getStuQQ() {
        return stuQQ;
    }

    public void setStuQQ(String stuQQ) {
        this.stuQQ = stuQQ;
    }

    public String getStuWechart() {
        return stuWechart;
    }

    public void setStuWechart(String stuWechart) {
        this.stuWechart = stuWechart;
    }

    public Integer getStuGrade() {
        return stuGrade;
    }

    public void setStuGrade(Integer stuGrade) {
        this.stuGrade = stuGrade;
    }

    public Integer getStuDegree() {
        return stuDegree;
    }

    public void setStuDegree(Integer stuDegree) {
        this.stuDegree = stuDegree;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Integer getStuSex() {
        return stuSex;
    }

    public void setStuSex(Integer stuSex) {
        this.stuSex = stuSex;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuPhone='" + stuPhone + '\'' +
                ", stuMail='" + stuMail + '\'' +
                ", stuQQ='" + stuQQ + '\'' +
                ", stuWechart='" + stuWechart + '\'' +
                ", stuGrade=" + stuGrade +
                ", stuDegree=" + stuDegree +
                ", stuAge=" + stuAge +
                ", stuSex=" + stuSex +
                ", teacher=" + teacher.getTeacherName() +
                ", status=" + status +
                '}';
    }
}
