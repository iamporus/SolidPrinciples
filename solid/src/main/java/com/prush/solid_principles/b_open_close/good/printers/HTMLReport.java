package com.prush.solid_principles.b_open_close.good.printers;

import com.prush.solid_principles.b_open_close.good.Report;

/**
 * A possible future requirement to print the report in web format.
 */
public class HTMLReport extends Report {

    @Override
    public String print() {

        // Code to print the Report in HTML format.
        return "/Report.html";
    }
}