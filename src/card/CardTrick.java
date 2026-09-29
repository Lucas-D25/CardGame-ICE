/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Lucas Dorata
//991827785
package card;

import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        boolean flag = false;
        Random rand = new Random();
        Card[] magicHand = new Card[7]; // Array of object
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(3) + 1]);
            magicHand[i] = c;
            System.out.println("Card " + (i +i) + ": " + magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2, clubs
        
        Scanner scan = new Scanner(System.in);
        
        Card d = new Card();
        
        System.out.println("Input a card value from 1-13: ");
        
        int cardValue = scan.nextInt();
        d.setValue(cardValue);
        
        System.out.println("Input a Suit Hearts, Clubs, Spades, Diamonds: ");
        
        String suitInput = scan.next();
        d.setSuit(suitInput);
        
        for (int i = 0; i < magicHand.length; i++) {
            if (magicHand[i].getSuit().equals(d.getSuit()) && magicHand[i].getValue() == d.getValue()){
                flag = true;
                break;
            }
        }
        
        if (flag == true) {
            System.out.println("There Was A Match!");
        }
        else {
            System.out.println("No Match!");
        }
    }
    
}
