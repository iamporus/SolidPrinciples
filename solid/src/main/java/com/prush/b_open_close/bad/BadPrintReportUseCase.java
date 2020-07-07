package com.prush.b_open_close.bad;

import com.prush.b_open_close.good.GoodPrintReportUseCase;

@SuppressWarnings({"unused", "DanglingJavadoc", "InnerClassMayBeStatic"})

/**
 * This class is an use case which accepts an report and creates pdf/html file.
 * <p>
 * Problems with this approach:
 * - ReportGenerator has a functionality of creating PDF and HTML reports. If any other type of report is expected in future,
 * the class will need to be modified.
 *
 * @see  GoodPrintReportUseCase for a solution which follows the principle and fixes the problems.
 */
public class BadPrintReportUseCase {

    private final BadReportGenerator reportGenerator;

    interface OnReportPrintedListener {
        void onPrintSuccess();
    }

    public BadPrintReportUseCase(BadReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void printReport(Report report, OnReportPrintedListener onReportPrintedListener) {

        if (report.getType() == 0)
            reportGenerator.createPDFReport(report, path -> {
                // always returns a path of generated PDF Report.
            });
        else if (report.getType() == 1)
            reportGenerator.createHTMLReport(report, path -> {
                // always returns a path of generated PDF Report.
            });
    }
}

/**
 * Example usage.
 * See how future requirements needs to modify existing classes.
 */
@SuppressWarnings("ALL")
class Driver {

    public static void main(String[] args) {

        BadPrintReportUseCase printReportUseCase = new BadPrintReportUseCase(new BadReportGenerator());

        Report pdfReport = new Report(0);
        printReportUseCase.printReport(pdfReport, () -> {
            //gives you pdf report
        });

        Report htmlReport = new Report(1);
        printReportUseCase.printReport(htmlReport, () -> {
            //gives you html report
        });

        /**
         * But when a new report type is expected in future, say excel or jpeg,
         * you have to add an if condition in BadPrintReportUseCase.printReport() and
         * provide implementation details there.
         *
         * This violates the OCP.
         */
    }
}

