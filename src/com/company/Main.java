/*
Author:J White
Date: 4/9/2019
Task: Baby Blackjack
Write a program that allows a human user to play a single hand of "blackjack"
against a dealer.

Pick two values from 1-10 for the player. These are the player's "cards".
Pick two more values from 1-10 for the dealer.
Whoever has the highest total is the winner.
There is no betting, no busting, and no hitting. Save that for real blackjack.

4/9 - (9:10 PM) UPDATING BASED ON TALKING WITH STEPHEN ABOUT ALLOWING THE CARDS TO BE RANDOM FOR BOTH THE PLAYER
AND THE DEALER
 */

package com.company;

// imports the java libraries for the Scanner and ThreadLocalClass
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

        public class Main {

            // calls the deal method to start the program
            public static void main(String[] args) {
//        deal();

//        CardArray generate = new CardArray();
//        generate.cards();

//        Dealer card = new Dealer();
//        card.deal();
//
        CardCopy play = new CardCopy();
        play.game();


    }//end of main () Method

    // method to start the blackjack game between the user and "dealer"
    public static void deal() {
        //variable declaration
        Scanner scanner = new Scanner(System.in);    // reads in user's input for card amount
        int pCard1;                                  // holds the user's (player) card amount
        int pCard2;                                  // holds the user's (player) card amount
        int dCard1;                                  // holds the dealer's (computer) card amount
        int dCard2;                                  // holds the dealer's (computer) card amount
        int pSum;                                    // holds the user's final score
        int dSum;                                    // holds the dealer's final score
        String ans;                                  // holds the user's choice to STAY or HIT

        int[] cards = new int [1];
        int[] hand = {};
        int size = 0;
        int card = 0;
        int j;


        // generates greeting
//        System.out.println("Howdy, Player!");
//        System.out.println("You look lucky ... ");
//        System.out.println("How about you have a seat and we have us a nice little " +
//                "game of Blackjack?");
//
//
//        // shows/implies that the Dealer gives the player two random cards
//        // then generates a random number between 1 and 10
//        System.out.println("");
//        System.out.println("Now I will draw two random cards for you, player.");
//        System.out.println("1...");
////        pCard1 = ThreadLocalRandom.current().nextInt(1,10);
//        pCard1 = (int) Math.round(Math.random()*10);
//         System.out.println("2...");
////        pCard2 = ThreadLocalRandom.current().nextInt(1,10);
//        pCard2 = (int) Math.round(Math.random()*10);
//        System.out.println("");
//
//        pSum = pCard1 + pCard2;
//
//        // Reveals ones of the player's cards and asks if the that ...
//        System.out.println("Player, your first card was a [" + pCard1 + "].");
//        System.out.println("Your second card is a [?].");

        //
        System.out.println("Would you like to 'STAY' or 'HIT'? Please enter 'STAY' to keep your" +
                " current cards or 'HIT' to add a new one: ");
        ans = scanner.nextLine().toUpperCase();

        do {

            size = size + 1;
//            for (int j = 0; j < 5; j++) {

            for (j = 0; j < 1; j++) {
                card = (int) Math.round(Math.random()*10);
                cards[j] = card;
//                Arrays.copyOf(hand,size);
//                System.out.print(card + " ");
//                System.out.println("");
//                System.out.println(hand[j] + " ");

            }//end

            Arrays.copyOf(hand,size);
            System.out.println(hand);

            System.out.println("");

//            size++;
            System.out.println(size);

            System.out.println("Would you like to 'STAY' or 'HIT'? Please enter 'STAY' to keep your" +
                    " current cards or 'HIT' to add a new one: ");
            ans = scanner.nextLine().toUpperCase();

            System.out.println("");

        } while (!(ans.equals("STAY")));

//
//        // shows/implies that the Dealer picks two cards
//        // then generates a random number between 1 and 10
//        System.out.println("Now I will pick two cards ...");
//        System.out.println("1...");
//
////        dCard1 = ThreadLocalRandom.current().nextInt(1,10);
//        dCard1 = (int) Math.round(Math.random()*10);
//        System.out.println("2...");
//
////        dCard2 = ThreadLocalRandom.current().nextInt(1,10);
//        dCard2 = (int) Math.round(Math.random()*10);
//        System.out.println("");
//
//        System.out.print("Player, you were given " + pCard1 + " , " + pCard2 +" and ");
////        for (int i = 0; i <= size; i++) {
////            System.out.println(cards[i]);
////        }
//
//        System.out.println("Your total is "+ pSum + ".");
//
//        // adds the card amounts together to get the card amount total
//        dSum = dCard1 + dCard2;
//        System.out.println("The Dealer drew " + dCard1 + " and " + dCard2 + ".");
//        System.out.println("The Dealer's total is "+ dSum + ".");
//        System.out.println("");
//
//        // checks to see which card total is higher and prints out who won the game
//        if((pSum <= 21) && (pSum > dSum))
//        {
//            System.out.println("YOU WIN, PARDNER! GREAT JOB!");
//            System.out.println("Thanks for playing.");
//
//        } else
//            System.out.println("YOU LOSE, PARDNER! MAYBE NEXT TIME.");
//        System.out.println("Thanks for playing.");

    }// end of main() method

}// end of MAIN {} class