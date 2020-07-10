package com.prush.solid_principles.b_open_close.good.printers;

import com.prush.solid_principles.b_open_close.bad.BadPrintReportUseCase;
import com.prush.solid_principles.b_open_close.good.Report;

/**
 * Existing reporting mechanism extracted out to conform to an abstraction.
 *
 * @see BadPrintReportUseCase for previous implementation.
 */
public class PDFReport extends Report {

    @Override
    public String print() {

        // Print Report in PDF format.
        return "/Report.pdf";
    }
}