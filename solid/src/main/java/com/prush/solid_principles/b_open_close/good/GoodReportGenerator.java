package com.prush.solid_principles.b_open_close.good;

import com.prush.solid_principles.b_open_close.good.interfaces.IReport;

/**
 * Changed from previous implementation to depend on an abstraction rather than on a concrete report data.
 */
public class GoodReportGenerator {

    public interface OnReportGeneratedListener {
        void onReportGenerated(String path);
    }

    public void createReport(IReport report, OnReportGeneratedListener listener) {

        String path = report.print();
        //invokes printing mechanism of passed in report type

        listener.onReportGenerated(path);
    }
}
