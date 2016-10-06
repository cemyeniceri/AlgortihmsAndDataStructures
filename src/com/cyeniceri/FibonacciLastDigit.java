package com.cyeniceri;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by cemyeniceri on 06/10/16.
 */
public class FibonacciLastDigit {
    private static BigInteger getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return new BigInteger("" + n);

        BigInteger previous = new BigInteger("0");
        BigInteger current  = new BigInteger("1");

        for (int i = 0; i < n - 1; ++i) {
            BigInteger tmp_previous = previous;
            previous = current;
            current = tmp_previous.add(current);
        }

        return current.mod(new BigInteger("10"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }

}
