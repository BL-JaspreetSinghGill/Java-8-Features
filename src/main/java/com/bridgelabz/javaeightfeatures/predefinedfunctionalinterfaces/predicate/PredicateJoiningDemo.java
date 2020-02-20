package com.bridgelabz.javaeightfeatures.predefinedfunctionalinterfaces.predicate;

import java.util.function.Predicate;

public class PredicateJoiningDemo {
    public static void main(String[] args) {
        int[] x = {0, 5, 10, 15, 20, 25, 30, 35};
        Predicate<Integer> p1 = i -> i%2==0;
        Predicate<Integer> p2 = i -> i>10;

        // and() or() and negate()

        //and()
        System.out.println("THE NUMBERS WHICH ARE EVEN AND GREATER THAN 10");
        for (int x1: x) {
            if (p1.and(p2).test(x1)) {
                System.out.println(x1);
            }
        }

        //or()
        System.out.println("THE NUMBERS WHICH ARE EVEN OR GREATER THAN 10");
        for (int x1: x) {
            if (p1.or(p2).test(x1)) {
                System.out.println(x1);
            }
        }

        //negate()
        System.out.println("THE NUMBERS WHICH ARE NOT EVEN");
        for (int x1: x) {
            if (p1.negate().test(x1)) {
                System.out.println(x1);
            }
        }

    }
}
