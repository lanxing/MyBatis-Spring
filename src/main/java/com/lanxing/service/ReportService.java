package com.lanxing.service;

import com.lanxing.model.Report;

import java.util.List;

/**
 * Created by lanxing on 16-3-1.
 */
public interface ReportService {
    public List<Report> findAllReports();
    public Report findReportById(int Id);
}
