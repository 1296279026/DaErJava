package com.chenming.lx;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
    public static void main(String[] args) {
        //通过Util包的Calendar 获取
        Calendar calendar= Calendar.getInstance();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        System.out.println(dateFormat.format(calendar.getTime()));

        //  通过Util包的Calendar 获取时间，分别获取年月日时分秒
        Calendar cal=Calendar.getInstance();
        int y=cal.get(Calendar.YEAR);
        int m=cal.get(Calendar.MONTH);
        int d=cal.get(Calendar.DATE);
        int h=cal.get(Calendar.HOUR_OF_DAY);
        int mi=cal.get(Calendar.MINUTE);
        int s=cal.get(Calendar.SECOND);
        System.out.println("代码运行时间是"+y+"年"+m+"月"+d+"日"+h+"时"+mi+"分"+s+"秒");
    }
}
