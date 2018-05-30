package com.data.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author dk
 * @date 2016/7/20
 */
public class ScheduleAtFixedRateDemo {
    public static void main(String[] args) {
        final Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.HOUR_OF_DAY, 11);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 0);
        System.out.println(calendar.getTime());
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(6000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println("execute task!"+new Date(this.scheduledExecutionTime()));
            }
        }, calendar.getTime(), 5 * 1000);

    }
}
