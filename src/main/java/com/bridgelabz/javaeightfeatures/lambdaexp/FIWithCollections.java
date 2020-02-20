package com.bridgelabz.javaeightfeatures.lambdaexp;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class FIWithCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(25);
        list.add(5);

        System.out.println("BEFORE SORTING : "+list);

        Comparator<Integer> comparator = (a,b) -> (a<b)?-1:(a>b)?1:0;
        Collections.sort(list, comparator);
        System.out.println("AFTER SORTING : "+list);

        System.out.println("USING STREAMS");
        list.stream()
            .forEach(System.out::println);

        System.out.println("PRINTING ONLY EVEN NUMBERS");
        List<Integer> list2 = list.stream()
                                  .filter(i -> i%2 == 0)
                                  .collect(Collectors.toList());
        System.out.println("PRINTING LIST 2 : "+list2);
    }
}
