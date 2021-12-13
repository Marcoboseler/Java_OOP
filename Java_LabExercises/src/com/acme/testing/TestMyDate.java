package com.acme.testing;
import com.acme.utils.MyDate;


public class TestMyDate {

    public static void main(String[] args) {

        MyDate date1 = new MyDate(8,22,2000);

        MyDate date2 = new MyDate();
        date2.setDay(22);
        date2.setMonth(8);
        date2.setYear(2042);

        MyDate date3 = new MyDate();
        date3.setDate(5,1,2000);

        String str1 = date1.toString();
        String str2 = date2.toString();
        String str3 = date3.toString();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

//        MyDate.leapYears();

        MyDate newYear = new MyDate(8,22,2000);
        MyDate fiscalStart = new MyDate(7,14,2007);

        if(newYear.equals(fiscalStart)){
            System.out.println("They are equal");
        }else {
            System.out.println("They ain't equal");
        }
    }
}
