package com.prush.solid_principles.b_open_close.bad;

public class Report {
    //other reporting fields
    int type;

    public Report(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
