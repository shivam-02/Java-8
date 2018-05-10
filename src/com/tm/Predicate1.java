package com.tm;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String gg[])
    {
        Predicate<String> checkLength=(a) -> a.length()>0;
        System.out.println(checkLength.test("shivam"));
        Predicate<Integer> checkOdds =(b) -> b%2!=0;
        System.out.println(checkOdds.test(3));
        System.out.println(checkOdds.negate().test(4));

    }
}
