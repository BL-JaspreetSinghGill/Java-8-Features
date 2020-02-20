package com.bridgelabz.javaeightfeatures.predefinedfunctionalinterfaces.function;

import java.util.function.Function;

public class StringLengthDemo {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("jaspreet"));
    }
}
