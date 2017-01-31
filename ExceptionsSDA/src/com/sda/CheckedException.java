package com.sda;

import com.sda.custom.SdaException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public static void main(String[] args) throws FileNotFoundException  {
        try {
            ownChecked();
        } catch (SdaException e) {
            System.out.println("EXCEPTION!!");
        } finally {
            System.out.println(" I WILL ALWAYS OCCUR.");
        }
        System.out.println("After");
//          checkedException();
    }

    private static void checkedException() throws FileNotFoundException {
        FileReader fr = new FileReader(new File("nieistniejacasciezka"));
        // try-catch
    }

    private static void ownChecked() throws SdaException {
         throw new SdaException();
        // try-catch
    }

}
