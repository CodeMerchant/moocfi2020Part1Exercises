/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.anothersandbox;

/**
 *
 * @author musa
 */
public class Person {

    private String name;
    private SimpleDate birthday;
    private int weight;
    private int length;

    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }

    //another constructor where birthday is given as integers(i.e arguments)
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public SimpleDate getBirthday() {
        return this.birthday;
    }
    
    public String getName(){
        return this.name;
    }
    

    public boolean olderThan(Person compared) {
      if (this.birthday.before((compared.getBirthday()))){
          return true;
      }

        return false;

    }

    @Override
    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
}
