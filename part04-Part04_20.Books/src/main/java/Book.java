/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class Book {
    private String title;
    private int numOfPages;
    private int pubYear;
    
    
    /**
     * 
     * @param nameOfBook takes the name/title of the book
     * @param howManyPages takes the number of pages in the book
     * @param year takes the year of publication
     */
    public Book(String nameOfBook, int howManyPages, int year){
        this.title = nameOfBook;
        this.numOfPages = howManyPages;
        this.pubYear = year;
    }
    /**
     * 
     * @return returns book title only 
     */
    public String getName(){
        return this.title;
    }
    
    @Override
    public String toString(){
        return this.title + ", " + this.numOfPages + " pages, " + this.pubYear;
    }
}
