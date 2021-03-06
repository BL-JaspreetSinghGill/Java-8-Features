package com.bridgelabz.javaeightfeatures.lambdaexp;

public class ThreadUsingAnonymousInnerClass {
    public static void main(String[] args) {
       /* Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<10; i++) {
                    System.out.println("CHILD THREAD");
                }
            }
        };*/

       Runnable r = () -> {
           for (int i=0; i<10; i++) {
               System.out.println("CHILD THREAD");
           }
       };

        Thread thread = new Thread(r);
        thread.start();
        for (int i=0; i<10; i++) {
            System.out.println("MAIN THREAD");
        }
    }
}
