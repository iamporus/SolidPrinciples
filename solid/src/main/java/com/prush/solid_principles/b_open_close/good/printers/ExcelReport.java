package com.prush.solid_principles.b_open_close.good.printers;

import com.prush.solid_principles.b_open_close.bad.BadPrintReportUseCase;
import com.prush.solid_principles.b_open_close.good.Report;

/**
 * Existing reporting mechanism extracted out to conform to an abstraction.
 *
 * @see BadPrintReportUseCase for previous implementation.
 */
public class ExcelReport extends Report {

    @Override
    public String print() {

        // Print Report in Excel format.
        return "/Report.xls";
    }
}