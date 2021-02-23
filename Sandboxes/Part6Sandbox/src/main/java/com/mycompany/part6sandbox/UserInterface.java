/*
 
 */
package com.mycompany.part6sandbox;

import java.util.Scanner;


public class UserInterface {

    private Scanner scanner;
    private WordSet wordSet;

    public UserInterface(WordSet wordSet, Scanner scan) {
        this.scanner = scan;
        this.wordSet = wordSet;
    }

    public void start() {
        while (true) {
            System.out.print("Enter a word:");
            String word = this.scanner.nextLine();

            if(this.wordSet.contains(word)){
                break;
            }
            
            this.wordSet.add(word);
        }
        System.out.println("You gave the same word twice!");
        
        System.out.println("");
        System.out.println(this.wordSet.palindromes() + " of the words were palindromes");
        
    }

   
}
