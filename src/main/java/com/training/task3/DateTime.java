package com.training.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
    public static int getCurrentYear() {
        /* Phương thức lấy ra thông tin về năm hiện tại */
        Date currentDate = new Date();
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        return Integer.parseInt(yearFormat.format(currentDate));
    }

    public static long calculateTimeDifference(Date startDate, Date endDate) {
        /* Phương thức tính khoảng thời gian giữa 2 mốc thời gian */
        return endDate.getTime() - startDate.getTime();
    }

    public static Date convertStringToDateTime(String dateString, String format) throws ParseException {
        /* Phương thức chuyển đổi từ String thành Date */
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.parse(dateString);
    }

    public static String convertDateTimeToString(Date date, String format) {
        /* Phương thức chuyển đổi từ  Date thành String */
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }

    public static void runDateTimeExercise() throws ParseException{
        int currentYear = getCurrentYear();
        System.out.println("Năm hiện tại là: " + currentYear);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date startDate = dateFormat.parse("2024-01-25 00:00:00");
        Date endDate = dateFormat.parse("2024-01-26 00:00:00");

        long timeDifference = calculateTimeDifference(startDate, endDate);
        System.out.println("Khoảng thời gian giữa " + startDate + " và " + endDate + " là: " + timeDifference + " milliseconds");

        String dateStr = "2024-01-25 12:30:00";
        Date dateObj = convertStringToDateTime(dateStr, "yyyy-MM-dd HH:mm:ss");
        System.out.println("String To Date: " + dateObj);

        String dateStr1 = convertDateTimeToString(dateObj, "yyyy-MM-dd HH:mm:ss");
        System.out.println("Date To String: " + dateStr1);
    }
}
