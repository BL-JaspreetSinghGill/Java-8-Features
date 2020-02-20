package com.bridgelabz.javaeightfeatures.defaultmethod.interfaces;

public interface ILeft {

    default void m1() {
        System.out.println("LEFT INTERFACE M1 METHOD");
    }
}
