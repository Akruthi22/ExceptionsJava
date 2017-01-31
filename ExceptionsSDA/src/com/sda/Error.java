package com.sda;

public class Error {

    public static void main(String[] args) {
        exampleError();
    }

    private static void exampleError() {
        infinityFrom(0);
    }

    private static void infinityFrom(int i) {
        infinityFrom(i + 1);
    }


}
