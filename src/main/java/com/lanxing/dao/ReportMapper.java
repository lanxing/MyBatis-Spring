package com.lanxing.dao;

import com.lanxing.model.Report;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lanxing on 16-2-27.
 */

@Repository(value="reportMapper")
public interface ReportMapper {
    Report findReportById(int id);
    List<Report> findAllReports();
    void insertReport(Report report);
    void updateReport(Report report);
}
