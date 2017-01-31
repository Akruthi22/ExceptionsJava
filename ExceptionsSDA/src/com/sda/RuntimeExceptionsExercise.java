package com.sda;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RuntimeExceptionsExercise {

    public static void main(String[] args) {
        runtimeMultipleTries();
        System.out.println("Sukces 1.");
        
        try {
            runtimeExercise();
        } catch (RuntimeException ex) {
            System.out.println(ex);
        }
        System.out.println("Sukces 2.");
        try {
            runtimeExercise();
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println(ioobe);
        } catch (ClassCastException cce) {
            System.out.println(cce);
        }
        System.out.println("Sukces 3.");
//        System.out.println("Sukces!");
    }

    /**
     * Krotko mowiac Twoim zadaniem jest "obsluzenie" wyjatkow.
     * 
     * Sprobuj zrobic to na kilka sposobow (kopiujac te metode):
     *  - Oddzielnie opakowac w try-catch instrukcje rzucajace rozne bledy.
     *  - Opakowac w jeden blok try-catch przy pomocy wspolnej superklasy dla wyjatkow.
     *  - Opakowac w jeden blok try natomiast uzyc kilku polecen catch.
     */
    private static void runtimeExercise() {
        List<String> list = new ArrayList<String>();
        list.get(10);
        Set<String> set = (Set<String>) list;
    }
    
    private static void runtimeMultipleTries() {
        List<String> list = new ArrayList<String>();
        try {
            list.get(10);
        } catch (IndexOutOfBoundsException iooe) {
            System.out.println(iooe);
        }
        try {
            Set<String> set = (Set<String>) list;
        } catch (ClassCastException cce) {
            System.out.println("You cannot cast like that :(.");
        }
        
    }

}
