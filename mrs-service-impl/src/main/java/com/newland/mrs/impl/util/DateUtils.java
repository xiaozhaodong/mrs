package com.newland.mrs.impl.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

    /**
     * 日期转化为指定日期格式类型
     * [url=home.php?mod=space&uid=952169]@Param[/url] date 日期
     *
     * @param pattern 日期格式类型，如yyyy-MM-dd，yyyy年MM月dd日 HH:mm:ss
     * @return
     */
    public static String dateToString(Date date, String pattern) {
        //日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 日期字符串转化为指定日期格式类型
     *
     * @param date_str 日期字符串
     * @param pattern  日期格式类型，如yyyy-MM-dd，yyyy年MM月dd日 HH:mm:ss
     * @return
     * @throws ParseException
     */
    public static Date stringToDate(String date_str, String pattern) throws ParseException {
        //日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(date_str);
    }

    /**
     * 获得今天日期
     *
     * @param pattern 日期格式类型，如yyyy-MM-dd，yyyy年MM月dd日 HH:mm:ss
     * @return
     */
    public static String getToday(String pattern) {
        //今天日期
        Date date = new Date();
        //日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 获得明天日期
     *
     * @param pattern 日期格式类型，如yyyy-MM-dd，yyyy年MM月dd日 HH:mm:ss
     * @return
     */
    public static String getTomorrow(String pattern) {
        //今天日期
        Date date = new Date();
        Calendar cal = new GregorianCalendar();
        //设置时间
        cal.setTime(date);
        //把日期往后增加一天.整数往后推,负数往前移动
        cal.add(Calendar.DATE, 1);
        //这个时间就是日期往后推一天的日期结果，即明天日期
        date = cal.getTime();
        //日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 获得昨天日期
     *
     * @param pattern 日期格式类型，如yyyy-MM-dd，yyyy年MM月dd日 HH:mm:ss
     * @return
     */
    public static String getYesterday(String pattern) {
        //今天日期
        Date date = new Date();
        Calendar cal = new GregorianCalendar();
        //设置时间
        cal.setTime(date);
        //把日期往后增加一天.整数往后推,负数往前移动
        cal.add(Calendar.DATE, -1);
        //这个时间就是日期往前推一天的日期结果，即昨天日期
        date = cal.getTime();
        //日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 获得指定日期的后一天
     *
     * @param date    指定日期
     * @param pattern 日期格式类型，如yyyy-MM-dd，yyyy年MM月dd日 HH:mm:ss
     * @return
     * @throws ParseException
     */
    public static Date getAfterDay(Date date, String pattern) throws ParseException {
        Calendar cal = new GregorianCalendar();
        //设置时间
        cal.setTime(date);
        //把日期往后增加一天.整数往后推,负数往前移动
        cal.add(Calendar.DATE, 1);
        //这个时间就是日期往后推一天的日期结果，即后一天日期
        date = cal.getTime();
        //日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        //后一天日期
        String next_date_str = sdf.format(date);
        //将日期字符串转化为指定日期格式类型
        return stringToDate(next_date_str, pattern);
    }

    /**
     * 获得指定日期的后一天
     *
     * @param date_str 指定日期字符串
     * @param pattern  日期格式类型，如yyyy-MM-dd，yyyy年MM月dd日 HH:mm:ss
     * @return
     * @throws ParseException
     */
    public static String getAfterDay(String date_str, String pattern) throws ParseException {
        //将日期字符串转化为指定日期格式类型
        Date date = stringToDate(date_str, pattern);
        Calendar cal = new GregorianCalendar();
        //设置时间
        cal.setTime(date);
        //把日期往后增加一天.整数往后推,负数往前移动
        cal.add(Calendar.DATE, 1);
        //这个时间就是日期往后推一天的日期结果，即后一天日期
        date = cal.getTime();
        //日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 获得指定日期的前一天
     *
     * @param date    指定日期
     * @param pattern 日期格式类型，如yyyy-MM-dd，yyyy年MM月dd日 HH:mm:ss
     * @return
     * @throws ParseException
     */
    public static Date getBeforeDay(Date date, String pattern) throws ParseException {
        Calendar cal = new GregorianCalendar();
        //设置时间
        cal.setTime(date);
        //把日期往后增加一天.整数往后推,负数往前移动
        cal.add(Calendar.DATE, -1);
        //这个时间就是日期往后推一天的日期结果，即前一天日期
        date = cal.getTime();
        //日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        //前一天日期
        String before_date_str = sdf.format(date);
        //将日期字符串转化为指定日期格式类型
        return stringToDate(before_date_str, pattern);
    }

    /**
     * 获得指定日期的前一天
     *
     * @param date_str 指定日期字符串
     * @param pattern  日期格式类型，如yyyy-MM-dd，yyyy年MM月dd日 HH:mm:ss
     * @return
     * @throws ParseException
     */
    public static String getBeforeDay(String date_str, String pattern) throws ParseException {
        //将日期字符串转化为指定日期格式类型
        Date date = stringToDate(date_str, pattern);
        Calendar cal = new GregorianCalendar();
        //设置时间
        cal.setTime(date);
        //把日期往后增加一天.整数往后推,负数往前移动
        cal.add(Calendar.DATE, -1);
        //这个时间就是日期往后推一天的日期结果，即前一天日期
        date = cal.getTime();
        //日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 获得当前的前几天
     *
     * @param offset  指定日期字符串
     * @param pattern 日期格式类型，如yyyy-MM-dd，yyyy年MM月dd日 HH:mm:ss
     * @return
     */
    public static String getBeforeDayWithFormat(int offset, String pattern) {
        //将日期字符串转化为指定日期格式类型
        Date date = new Date();
        Calendar cal = new GregorianCalendar();
        //设置时间
        cal.setTime(date);
        //把日期往后增加一天.整数往后推,负数往前移动
        cal.add(Calendar.DATE, -offset);
        //这个时间就是日期往后推一天的日期结果，即前一天日期
        date = cal.getTime();
        //日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

}
