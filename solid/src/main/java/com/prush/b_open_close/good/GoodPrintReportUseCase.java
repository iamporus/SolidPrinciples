package com.prush.b_open_close.good;

import com.prush.b_open_close.good.interfaces.IReport;
import com.prush.b_open_close.good.printers.ExcelReport;
import com.prush.b_open_close.good.printers.HTMLReport;
import com.prush.b_open_close.good.printers.PDFReport;

@SuppressWarnings({"unused", "DanglingJavadoc", "InnerClassMayBeStatic"})

/**
 * This class follows Open Close Principle.
 * <p>
 * - Reporting functionality is abstracted out through use of an Interface
 * @see IReport
 *
 * - Existing and future requirements can conform to this interface:
 *
 * @see PDFReport existing mechanism to print report in PDF format.
 * @see HTMLReport existing mechanism to print report in HTML format.
 *
 * @see GoodReportGenerator prefers abstraction over concrete implementation in print() method and
 * invokes the respective print() mechanism.
 * This allows developer to not change a single line in ReportGenerator and GoodPrintReportUseCase in future.
 *
 */
public class GoodPrintReportUseCase {

    private final GoodReportGenerator reportGenerator;

    interface OnReportPrintedListener {
        void onReportPrinted();
    }

    public GoodPrintReportUseCase(GoodReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void printReport(IReport report, OnReportPrintedListener onReportPrintedListener) {

        reportGenerator.createReport(report, path -> {

            // returns a path of generated Report. Type of report (PDF or HTML) depends upon
            // the passed implementation of IReport
        });
    }

}

/**
 * Example usage.
 * See how future requirements don't modify existing classes yet are able to extend them.
 */
@SuppressWarnings("DanglingJavadoc")
class Driver {

    public static void main(String[] args) {

        GoodPrintReportUseCase printReportUseCase = new GoodPrintReportUseCase(new GoodReportGenerator());

        Report pdfReport = new PDFReport();
        printReportUseCase.printReport(pdfReport, () -> {
            //gives you pdf report
        });

        Report htmlReport = new HTMLReport();
        printReportUseCase.printReport(htmlReport, () -> {
            //gives you html report.
        });

        /**
         * Future requirement follows
         */

        Report excelReport = new ExcelReport();
        printReportUseCase.printReport(excelReport, () -> {
            //gives you Excel report without changing a single line in existing classes.
        });

    }
}

