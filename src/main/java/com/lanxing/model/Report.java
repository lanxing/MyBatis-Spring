package com.lanxing.model;

import java.util.Date;

/**
 * Created by lanxing on 16-2-26.
 */
public class Report {
    private Integer id;
    private String proName;
    private String problem;
    private String nextPlan;
    private String reportContent;
    private Date reportTime;
    private Date modifyTime;
    private Student student;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getNextPlan() {
        return nextPlan;
    }

    public void setNextPlan(String nextPlan) {
        this.nextPlan = nextPlan;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", proName='" + proName + '\'' +
                ", problem='" + problem + '\'' +
                ", nextPlan='" + nextPlan + '\'' +
                ", reportContent='" + reportContent + '\'' +
                ", reportTime=" + reportTime +
                ", modifyTime=" + modifyTime +
                ", student=" + student.getStuName() +
                '}';
    }
}
