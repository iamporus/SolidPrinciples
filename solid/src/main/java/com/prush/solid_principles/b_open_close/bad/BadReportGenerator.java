package com.prush.solid_principles.b_open_close.bad;

/**
 * Responsibility of this class suggests to be of report generation.
 * This class should be closed for modification for any future requirements.
 * But, if a requirement comes in future related to reporting to some other file type, this class will have to change,
 * violating the Open-Close Principle.
 */
public class BadReportGenerator {

    public interface OnReportGeneratedListener {
        void onReportGeneratedSuccess(String path);
    }

    public void createPDFReport(Report report, OnReportGeneratedListener listener) {

        // create a pdf file and write report data to it.

        listener.onReportGeneratedSuccess("/report.pdf");
    }

    public void createHTMLReport(Report report, OnReportGeneratedListener listener) {

        // create a pdf file and write report data to it.

        listener.onReportGeneratedSuccess("/report.html");
    }


}
