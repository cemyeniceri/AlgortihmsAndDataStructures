package com.cyeniceri;

import java.util.Scanner;

/**
 * Created by cemyeniceri on 05/10/16.
 */
public class Fibonacci {
    public static long calc_fib(int n) {
        if (n <= 1)
            return n;
        else
            return calc_fib(n - 1) + calc_fib(n - 2);
    }

    public static long calc_fib_efficent(int n) {
        final long f[] = new long[n + 2];
        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long cur = System.currentTimeMillis();
        System.out.println("calc_fib : " + calc_fib(n));
        System.out.println("Duration of Naive : " + (System.currentTimeMillis() - cur));
        long cur2 = System.currentTimeMillis();
        System.out.println("calc_fib_efficent : " + calc_fib_efficent(n));
        System.out.println("Duration of calc_fib_efficent : " + (System.currentTimeMillis() - cur2));
    }
}