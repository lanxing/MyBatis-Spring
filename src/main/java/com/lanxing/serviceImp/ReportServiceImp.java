package com.lanxing.serviceImp;

import com.lanxing.dao.ReportMapper;
import com.lanxing.model.Report;
import com.lanxing.service.ReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lanxing on 16-3-1.
 */

@Service("reportService")
public class ReportServiceImp implements ReportService {

    private ReportMapper reportMapper;

    public ReportMapper getReportMapper() {
        return reportMapper;
    }

    @Resource
    public void setReportMapper(ReportMapper reportMapper) {
        this.reportMapper = reportMapper;
    }

    @Override
    public List<Report> findAllReports() {
        return reportMapper.findAllReports();
    }

    @Override
    public Report findReportById(int Id) {
        return reportMapper.findReportById(Id);
    }
}
