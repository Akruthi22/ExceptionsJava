package com.sda;

import java.util.Random;

public class RuntimeExceptions {

    public static void main(String[] args) {
//        try {
//            runtimeExample();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        bitMoreAdvancedExample();
    }

    private static void runtimeExample() {
        int[] intArray = { 1, 2 };
        int first = intArray[0];
        System.out.println(first);
        int lastIHope = intArray[intArray.length];
        System.out.println(lastIHope);
//
//        try {
//            int tryLast = intArray[intArray.length];
//        } catch (ArrayIndexOutOfBoundsException aioobe) {
//            System.out.println(aioobe);
//            System.out.println("Message: " + aioobe.getMessage());
//            System.out.println("Cause: " + aioobe.getCause());
//        }
//        System.out.println("Lece dalej.");
//
//        try {
//            int tryLast = intArray[intArray.length];
//        } catch (Exception ex) {
//            System.out.println(ex);
//            System.out.println("Message: " + ex.getMessage());
//            System.out.println("Message: " + ex.getCause());
//        }
    }

    private static void bitMoreAdvancedExample() {
        try {
            errorThrower();
        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage().toUpperCase());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage().toLowerCase());
        } catch (Exception ex) {
            // logowane nieznany blad.
        }

    }

    private static void errorThrower() {
        Random random = new Random();
        if (random.nextBoolean()) {
            throw new IllegalStateException("I am an illegal state exception.");
        } else {
            throw new IllegalArgumentException("I am an illegal argument exception.");
        }
    }

}
