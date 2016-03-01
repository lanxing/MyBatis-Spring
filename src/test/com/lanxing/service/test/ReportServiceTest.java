package com.lanxing.service.test;

import com.lanxing.model.Report;
import com.lanxing.service.ReportService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by lanxing on 16-3-1.
 */
public class ReportServiceTest {

    private static ReportService reportService;
    static {
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml", "spring-mybatis.xml"});
        reportService = (ReportService)ac.getBean("reportService");
    }

    @Test
    public void findAllReportsTest(){
        List<Report> reports = reportService.findAllReports();

        for (Report report:reports) {
            System.out.println(report);
        }
    }

    @Test
    public void findReportByIdTest(){

        Report report = reportService.findReportById(1);
        System.out.println(report);
    }
}
