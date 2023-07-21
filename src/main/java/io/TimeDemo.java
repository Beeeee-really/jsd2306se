package io;

public class TimeDemo {
    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        System.out.println(now);

        now = now / 1000 / 60 / 60 / 24 / 365;
        System.out.println(now);

        long max = Long.MAX_VALUE;
        max = max / 1000 / 60 / 60 / 24 / 365;
        System.out.println("公元:" + max);


    }
}
