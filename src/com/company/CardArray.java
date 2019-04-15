package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CardArray {

//    int[] hand = new int[7];
    int[] hand = new int[51];
    int card;
//    int i;

    String ans;
    Scanner scanner = new Scanner(System.in);

    public void cards() {

//        card = (int) Math.round(Math.random()*10);

//        // Original code 1 -- WORKING
//        for (int j = 0; j < 5; j++) {
//
//            card = (int) Math.round(Math.random()*10);
//            hand[j] = card;
//            System.out.print(card + " ");
//            System.out.println("");
//            System.out.print(hand[j] + " ");
//
//        }

        // Code Modification 2
        System.out.print("Would you like to 'STAY' or 'HIT'? Please enter 'STAY' to keep your" +
                " current cards or 'HIT' to add a new one: ");
        ans = scanner.nextLine().toUpperCase();

        do {

            for (int j = 0; j < 5; j++) {

                card = (int) Math.round(Math.random()*10);
                hand[j] = card;
                System.out.print(card + " ");
                System.out.println("");
                System.out.print(hand[j] + " ");

            }//end

            System.out.print("Would you like to 'STAY' or 'HIT'? Please enter 'STAY' to keep your" +
                    " current cards or 'HIT' to add a new one: ");
            ans = scanner.nextLine().toUpperCase();


        } while(!(ans == "STAY"));



    }//end of Main() Method



} //end of CardArray {} class
