package com.pgi;

import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Function;

public abstract class CustomTimer {
    private int h;
    private int m;
    private int s;

    public abstract void start();
    public abstract void setPeriod(int period);
    public abstract void setLimit(int limit);
    public abstract void setCallback(Function<String,String> callback);

    private String makeTime() {
        this.s += 1;

        if ( this.s > 59) {
            // increment minute and reset seconds when waited 60 seconds
            this.m += 1;
            if (this.m > 59) {
                // increment hour when waited 60 minutes
                this.h += 1;
                // reset hour when waited 24 hours
                if (this.h > 23) {
                    this.h = 0;
                }
                // set minutes to 0 when waited 60 seconds
                this.m = 0;
            }
            // set seconds to 0 when waited 60 seconds
            this.s = 0;
        }
        return getFormat(this.h) + "h" + getFormat(this.m) + "m" + getFormat(this.s) + "s";
    }

    private static String getFormat(int item) {
        return item < 10 ? "0" + item : String.valueOf(item);
    };

    public void waitPeriod(int period, int limit, Function<String,String> callback) {
        Timer timer = new Timer();
        final int[] stop = {limit};

        timer.schedule(new TimerTask(){
            @Override
            public void run() {
                if (stop[0] <= 0) {
                    timer.cancel();
                } else {
                    callback.apply(makeTime());
                    stop[0] -= period;
                }
            }

        }, 0, period);
    }
}
