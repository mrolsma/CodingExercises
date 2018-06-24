package com.company;

/**
 * Created by matth on 6/24/2018.
 */
public class BarkingDog {


    public static boolean bark (boolean barking, int hourOfDay) {



        if (barking = true && hourOfDay >= 8 && hourOfDay <= 22) {
            System.out.println("false");
            return false;
        }
        if (barking = true && hourOfDay < 8 && hourOfDay >= 0) {
            System.out.println("true");
            return true;
        }
        if (barking = true && hourOfDay > 22 && hourOfDay <24)  {
            System.out.println("false");
            return true;}

        if (barking = false) {
            System.out.println("false");
            return false;
        } else {
            System.out.println("false");
            return false;
        }

    }
}
