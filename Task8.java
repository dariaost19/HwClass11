package Homework9;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {


        //Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
        // Then print all values from that array using 2 different loops and calculate how many total countries been stored
        String[][] countries = {{"Canada", "Bahamas", "USA"},
                {"Brazil", "Peru", "Ecuador"},
                {"Poland", "Ukraine", "Germany", "France"},
                {"Thailand", "Philippines", "Cambodia"},
                {"South Africa", "Botswana", "Mauritius"},

        };
        int sumofcontries = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);

            }

        }
        System.out.println();

        for (String[] list : countries) {
            for (String newlist : list) {
                System.out.print(newlist + " ");

            }
            System.out.println();


        }
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                sumofcontries++;
            }

        }
        System.out.println( "Total counties " + sumofcontries);
    }
}




