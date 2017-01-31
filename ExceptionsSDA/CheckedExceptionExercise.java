package com.sda;

import com.sda.myexceptions.FalsehoodException;
import com.sda.myexceptions.TruthException;
import java.util.Random;

/**
 * W paczce com.sda.myexceptions stworz dwa wyjatki. Jeden z nich powinien
 * nazywac sie TruthException, drugi FalsehoodException.
 * 
 * TruthException powinien miec domyslna wiadomosc "I am only truth".
 * 
 * FalsehoodException powinien miec domyslna wiadomosc "I am just a white lie"
 * 
 * Nastepnie nalezy stworzyc metode (np. randomException()), ktora bedzie
 * losowala "rzucanie" jednego z wyjatkow.
 * 
 * Druga metoda powinna wzywac metode randomException() i obslugiwac oba wyjatki
 * w wybrany przez Ciebie sposob.
 */
public class CheckedExceptionExercise {

    public static void main(String[] args) {
        try {
            randomException();
        } catch (TruthException | FalsehoodException e) {
            System.out.println("Exception occured: " + e);
        }
    }

    private static void randomException() throws TruthException, FalsehoodException {
        Random random = new Random();
        if (random.nextBoolean()) {
            throw new TruthException();
        } else {
            throw new FalsehoodException();
        }
    }

}
