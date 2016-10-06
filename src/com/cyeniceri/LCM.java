package com.cyeniceri;

import java.util.Scanner;

/**
 * Created by cemyeniceri on 06/10/16.
 */
public class LCM {
    private static long lcm_naive(int a, int b) {
        long l = 1;
        for (; l <= (long) a * b; ++l)
            if (l % a == 0 && l % b == 0)
                break;
        return l;
    }

    private static long lcm_eff(int a, int b) {
        long gcd = new GreatestCommonDivisor().gcdEuclideanEfficiency((long)a, (long)b);

        return  (long)a*b /gcd;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        long cur = System.currentTimeMillis();
        System.out.println("lcm_naive : " + lcm_naive(a, b));
        System.out.println("Duration of lcm_naive : " + (System.currentTimeMillis() - cur));
        long cur2 = System.currentTimeMillis();
        System.out.println("lcm_eff : " + lcm_eff(a, b));
        System.out.println("Duration of lcm_eff : " + (System.currentTimeMillis() - cur2));

    }
}
