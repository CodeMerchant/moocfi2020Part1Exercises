/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part6sandbox_grade;

/**
 *
 * @author musa
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      GradeRegister register = new GradeRegister();
      
     UserInterface ui = new UserInterface(register,scan);
     ui.start();
     
      
    }
}
