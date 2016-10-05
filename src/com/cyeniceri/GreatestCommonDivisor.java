package com.cyeniceri;

/**
 * Created by cemyeniceri on 05/10/16.
 */
public class GreatestCommonDivisor {

    public static long gcdNaive(long x1, long x2) {
        final long min = Math.min(x1, x2);

        for(long i = min; i > 0; i--){
            if(x1%i == 0 && x2%i == 0)
                return i;
        }
        return -1;
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
        long cur = System.currentTimeMillis();
        System.out.println("gcdNaive : " + gcdNaive(4587989721L, 212121212121L));
        System.out.println("Duration of gcdNaive : " + (System.currentTimeMillis() - cur));
        long cur2 = System.currentTimeMillis();
        System.out.println("gcdEuclideanEfficiency : " + gcdEuclideanEfficiency(4587989721L, 212121212121L));
        System.out.println("Duration of gcdEuclideanEfficiency : " + (System.currentTimeMillis() - cur2));
    }
}
