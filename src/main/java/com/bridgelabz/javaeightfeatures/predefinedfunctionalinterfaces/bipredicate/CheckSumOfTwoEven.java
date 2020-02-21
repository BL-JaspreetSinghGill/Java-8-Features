package com.bridgelabz.javaeightfeatures.predefinedfunctionalinterfaces.bipredicate;

import java.util.function.BiPredicate;

public class CheckSumOfTwoEven {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> p = (a,b) -> (a+b)%2==0;
        System.out.println(p.test(2,3));
        System.out.println(p.test(0,6));
    }
}
