package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

        Date today = new Date();

        String str = format.format(today);

        System.out.println(str);

        String str2 = "2016/05/19 23:59:30";
        Date date = format2.parse(str2);

        System.out.println(date);

    }

}
