package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        cal.set(2016, Calendar.MAY, 19, 23, 59, 30);

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

        Date date = cal.getTime();

        String str = format.format(date);

        System.out.println(str);

        cal.set(Calendar.YEAR, Calendar.MONTH, Calendar.DAY_OF_YEAR, Calendar.HOUR_OF_DAY, Calendar.MINUTE, Calendar.SECOND);

        date = cal.getTime();

        String str2 = format2.format(date);

        System.out.println(str2);
    }

}
