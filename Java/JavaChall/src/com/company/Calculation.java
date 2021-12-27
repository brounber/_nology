package com.company;

public class Calculation {

    public static String convertTime( int seconds){
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int second = seconds % 60;

        return String.format("%02dh %02dm %02ds", hours, minutes, second);

    }

    public static String convertTime( double minutes){
        double hours = minutes / 60;
        double minute = minutes % 60;
        double second = minutes * 60;

        return String.format("%02fh %02fm %02fs", hours, minute, second);

    }
}
