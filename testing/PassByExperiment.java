package com.acme.testing;
import com.acme.utils.MyDate;

public class PassByExperiment {

    public static void main(String[] args) {
        MyDate date = new MyDate(1,20,2008);

        System.out.println("Before passing an object " + date);
        passObject(date);
        System.out.println("After passing an object " + date);
        System.out.println(date);

        passString(date.toString());
        System.out.println("------------------------------");
        System.out.println("Before passing a primitive  " + date.getYear());
        passPrimitive(date.getYear());
        System.out.println("After passing a primitive  " + date.getYear());
    }

    public static void passObject(MyDate d) {
        d.setYear(2021);
    }

    public static void passPrimitive(int i) {
        i = 2042;
    }

    public static void passString(String s) {
        int yearSlash = s.lastIndexOf('/');
        s = s.substring(0, yearSlash + 1);
        s += "2042";
        System.out.println("New date string: " + s);
    }



}
