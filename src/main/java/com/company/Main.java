package com.company;

public class Main {

    /**
     * Provides a simple example on how to use.
     * @param args
     */
    public static void main(String[] args) {

        ArabicTools arabicTools = new ArabicTools();

        arabicTools.isFeminine = true;
        System.out.println(arabicTools.numberToArabicWords("314"));
        System.out.println(arabicTools.numberToArabicWords("200000"));
        System.out.println(arabicTools.numberToArabicWords("696464416455312089898469"));
    }
}
