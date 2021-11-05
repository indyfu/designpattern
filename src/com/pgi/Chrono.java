package com.pgi;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Function;

public class Chrono extends CustomTimer {
    private int period;
    private int limit;
    private Function<String,String> callback;

    @Override
    public void setCallback(Function<String,String> callback) {
        this.callback = callback;
    }

    @Override
    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public void start() {
        try {
            waitPeriod(period, limit, callback);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}