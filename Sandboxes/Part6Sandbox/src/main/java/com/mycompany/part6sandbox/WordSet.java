/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part6sandbox;


import java.util.ArrayList;

public class WordSet {
 private ArrayList<String> wordsList;
 
 public WordSet(){
     this.wordsList = new ArrayList<>();
     
 }
 
 public void add(String word){
     this.wordsList.add(word);
 }
 
 public boolean contains(String word){
     return this.wordsList.contains(word);
 }
 
 //adding more functionality - palindrome check
 public int palindromes(){
     int count = 0;
     
     for(String word : this.wordsList){
         if(isPalindrome(word)){
             count++;
         }
         
     }
     return count;
 }
 
 public boolean isPalindrome(String word){
     int end = word.length() - 1;
     
     int i = 0;
     
     //open up while loop
     while(i < word.length() / 2){
         //we use charAt to return character at given index
         //as as simple variable
         if(word.charAt(i) != word.charAt(end - i)){
             return false;
         }
         
         i++;
     }
     
     return true;
 }
}
