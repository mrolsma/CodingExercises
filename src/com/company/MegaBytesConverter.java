package com.company;

/**
 * Created by matth on 6/24/2018.
 */
public class MegaBytesConverter {
        public static void printMegaBytesAndKiloBytes(int kiloBytes){
            if(kiloBytes >= 0) {
                int megaBytes = kiloBytes / 1024;
                int remainingKiloBytes = kiloBytes % 1024;
                System.out.println(kiloBytes + " KB" + " = " + megaBytes + " MB" + " and " + remainingKiloBytes + " KB");
            }
            else {

            }

        }

    }
