package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/9/29/029.
 */
public class DateUtil {
    /**
     * yyyy-MM-dd HH:mm:ss:SSS
     */
    public static final String yyyy_MM_dd_HH_mm_ss_SSS = "yyyy-MM-dd HH:mm:ss:SSS";

    /**
     * yyyy-MM-dd HH:mm:ss
     */
    public static final String yyyy_MM_dd_HH_mm_ss = "yyyy-MM-dd HH:mm:ss";

    /**
     * yyyy-MM-dd
     */
    public static final String yyyy_MM_dd = "yyyy-MM-dd";

    /**
     * MM-dd
     */
    public static final String MM_dd = "MM-dd";

    /**
     * HH:mm:ss
     */
    public static final String HH_mm_ss = "HH:mm:ss";

    /**
     * HH:mm
     */
    public static final String HH_mm = "HH:mm";

    public static int getCurrentMonth(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        String month = sdf.format(date);
        return Integer.valueOf(month);
    }

    public static int getQuarterLastMonth(int QuarterNum) {
        return (QuarterNum - 1) * 3 + 3;
    }

    public static int getCurrentYear(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String year = sdf.format(date);
        return Integer.valueOf(year);
    }

    public static String getDateTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(yyyy_MM_dd_HH_mm_ss);
        return sdf.format(date);
    }

    public static String getDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(yyyy_MM_dd);
        return sdf.format(date);
    }

    public static String getDateTimeByDate(String date) {
        return date + " 00:00:00";
    }

    /**
     * @param dateString 2016-12-21
     * @param day        天数
     * @return 增加失败返回原字符串
     */
    public static String addDate(String dateString, int day, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Date date = sdf.parse(dateString);
            long t = date.getTime();// 获取当前的毫秒数
            t += (day * 24 * 60 * 60 * 1000);// 当前毫秒数加上一天的毫秒数(1*24*60*60*1000)
            date.setTime(t);// 将总毫秒数重新赋值给date对象
            // 以下是将时间格式化输出的日期
            return sdf.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dateString;
    }

    /**
     * 比较日期
     * <p>格式：yyyy-MM-dd HH:mm:ss</p>
     *
     * @param date1 time的String类型
     * @param date2 time的String类型
     * @return -2表示发生异常 -1表示前者小于后者  0表示相等  1表示前者大于后者
     */
    public static int compareDate(String date1, String date2) {
        return compareDateWithFormat(date1, date2, yyyy_MM_dd_HH_mm_ss);
    }

    /**
     * 比较日期
     * <p>格式：yyyy-MM-dd HH:mm:ss</p>
     *
     * @param date1 time的String类型
     * @param date2 time的Date类型
     * @return -2表示发生异常 -1表示前者小于后者  0表示相等  1表示前者大于后者
     */
    public static int compareDate(String date1, Date date2) {
        return compareDateWithFormat(date1, date2, yyyy_MM_dd_HH_mm_ss);
    }

    /**
     * 比较短日期
     * <p>格式：yyyy-MM-dd</p>
     *
     * @param date1 time的String类型
     * @param date2 time的String类型
     * @return -2表示发生异常 -1表示前者小于后者  0表示相等  1表示前者大于后者
     */
    public static int compareSmallDate(String date1, String date2) {
        return compareDateWithFormat(date1, date2, yyyy_MM_dd);
    }

    /**
     * 比较短日期
     * <p>格式：yyyy-MM-dd</p>
     *
     * @param date1 time的String类型
     * @param date2 time的Date类型
     * @return -2表示发生异常 -1表示前者小于后者  0表示相等  1表示前者大于后者
     */
    public static int compareSmallDate(String date1, Date date2) {
        return compareDateWithFormat(date1, date2, yyyy_MM_dd);
    }

    /**
     * 比较时间
     *
     * @param date1 time的Date类型
     * @param date2 time的Date类型
     * @return -1表示前者小于后者  0表示相等  1表示前者大于后者
     */
    public static int compareDate(Date date1, Date date2) {
        if (date1.getTime() > date2.getTime()) {
            return 1;
        } else if (date2.getTime() < date2.getTime()) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * 比较时间
     *
     * @param date2 time的String类型
     * @param date2 time的String类型
     * @return -2表示发生异常 -1表示前者小于后者  0表示相等  1表示前者大于后者
     */
    public static int compareDateWithFormat(String date1, String date2, String format) {
        try {
            SimpleDateFormat sdf = getSdf(format);
            Date l = sdf.parse(date1);
            Date r = sdf.parse(date2);
            if (l.getTime() > r.getTime()) {
                return 1;
            } else if (l.getTime() < r.getTime()) {
                return -1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return -2;
        }
    }

    private static SimpleDateFormat getSdf(String format) {
        // TODO Auto-generated method stub
        return new SimpleDateFormat(format);
    }

    /**
     * 比较时间
     *
     * @param date2 time的String类型
     * @param date2 time的Date类型
     * @return -2表示发生异常 -1表示前者小于后者  0表示相等  1表示前者大于后者
     */
    public static int compareDateWithFormat(String date1, Date date2, String format) {
        try {
            SimpleDateFormat sdf = getSdf(format);
            Date l = sdf.parse(date1);
            if (l.getTime() > date2.getTime()) {
                return 1;
            } else if (l.getTime() < date2.getTime()) {
                return -1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return -2;
        }
    }

    public static long transferDateToLong(String formart, String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(formart);
            Date dt2 = sdf.parse(date);
            return dt2.getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 把long 转换成 日期 再转换成String类型
     */
    public static String transferLongToDate(String formart, Long millSec) {
        SimpleDateFormat sdf = new SimpleDateFormat(formart);
        Date date = new Date(millSec);
        return sdf.format(date);
    }

}