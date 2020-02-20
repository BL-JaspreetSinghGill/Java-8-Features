package com.bridgelabz.javaeightfeatures.predefinedfunctionalinterfaces.consumer;

import java.util.function.Consumer;

public class PrintingUsingConsumer {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("jaspreet");
    }
}
