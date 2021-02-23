/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part6sandbox;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WordSet set = new WordSet();
        
        UserInterface userInterface = new UserInterface(set, scan);

        //starting user interface
        userInterface.start();
    }
}
