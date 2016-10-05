package com.cyeniceri;

/**
 * Created by cemyeniceri on 05/10/16.
 */
public class Fibonacci {
    public static long fibNaive(int n) {
        if(n <= 1)
            return n;
        else
            return fibNaive(n-1) + fibNaive(n-2);
    }

    public static long fibEfficiency(int n) {
        final long f[] = new long[n+2];
        f[0] = 0;
        f[1] = 1;

        for(int i = 2; i <= n; i++){
            f[i] = f[i-1] + f[i-2];
        }

        return f[n];
    }

    public static void main(String[] args) {
        long cur = System.currentTimeMillis();
        System.out.println("fibNaive : " + fibNaive(45));
        System.out.println("Duration of Naive : " + (System.currentTimeMillis() - cur));
        long cur2 = System.currentTimeMillis();
        System.out.println("fibEfficiency : " + fibEfficiency(45));
        System.out.println("Duration of fibEfficiency : " + (System.currentTimeMillis() - cur2));
    }
}
