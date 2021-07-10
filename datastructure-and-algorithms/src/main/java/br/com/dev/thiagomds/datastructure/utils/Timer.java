package br.com.dev.thiagomds.datastructure.utils;


import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class Timer {

    //private static Instant start;
    //private static Instant stop;
    private static long start;
    private static long stop;


    /*
    public static Instant startTime(){
        start = null;
        start = Instant.now();
        return start;
    }

    public static Instant stopTime(){
        stop = null;
        stop = Instant.now();
        return stop;
    }

    public static void diffTime(){
         long duration = Duration.between(Timer.start, Timer.stop).toNanos();
        System.out.println( "Duration in Nano: " + duration );
    }
    */
     public static long startTime(){
         start = System.nanoTime();
         return start;
     }

     public static long stopTime(){
         stop = System.nanoTime();
         return stop;
     }

     public static void diffTime(){
         System.out.println( "Duration in Nano: " + (stop - start) );
     }


}
