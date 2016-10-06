package com.cyeniceri;

import java.util.Scanner;

/**
 * Created by cemyeniceri on 05/10/16.
 */
public class GreatestCommonDivisor {

    private static int gcd_naive(long a, long b) {
        int current_gcd = 1;
        for(int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }

        return current_gcd;
    }

    public static long gcdEuclideanEfficiency(long x1, long x2) {
        if(x2 == 0)
            return x1;
        else{
            final long rem = x1%x2;
            return gcdEuclideanEfficiency(x2, rem);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();


        long cur = System.currentTimeMillis();
        System.out.println("gcd_naive : " + gcd_naive(a, b));
        System.out.println("Duration of gcd_naive : " + (System.currentTimeMillis() - cur));
        long cur2 = System.currentTimeMillis();
        System.out.println("gcdEuclideanEfficiency : " + gcdEuclideanEfficiency(a, b));
        System.out.println("Duration of gcdEuclideanEfficiency : " + (System.currentTimeMillis() - cur2));
    }
}
