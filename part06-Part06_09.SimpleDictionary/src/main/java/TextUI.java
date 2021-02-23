/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class TextUI {

    private SimpleDictionary simpleDict;
    private Scanner scan;

    public TextUI(Scanner scan, SimpleDictionary dictionary) {
        this.scan = scan;
        this.simpleDict = dictionary;
    }

    /*  public void start() {
      //my solution. Works 100% but is a bit clumsy
        while (true) {
            System.out.print("command: ");
            String command = this.scan.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = this.scan.nextLine();
                System.out.print("Translation: ");
                String translation = this.scan.nextLine();

                this.simpleDict.add(word, translation);

            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String wordTranslate = scan.nextLine();

                if (this.simpleDict.translate(wordTranslate) == null) {
                    System.out.println("Word " + wordTranslate + " was not found");

                } else {
                    System.out.println("Translation: " + this.simpleDict.translate(wordTranslate));
                }

            } else {
                System.out.println("Unknown command");
            }

        } */
    //a more elegant, cleaner solution - suggested solution from TMC
    //Try to find the most elegant way to write your code bro. The course
    //doesn't need to explicitly tell you sometimes. Think!
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();

            if (command.equals("end")) {
                break;
            }

            //pass command var to processCommand method
            processCommand(command);
        }

        System.out.println("Bye bye!");

    }

    //processCommand method
    public void processCommand(String command) {
        if (command.equals("add")) {
            //call add() method
            add();
        } else if (command.equals("search")) {
            //call search method
            search();
        } else {
            System.out.println("Unknown command");
        }
    }

    //add method
    public void add() {
        System.out.print("Word: ");
        String word = this.scan.nextLine();
        System.out.print("Translation: ");
        String translation = this.scan.nextLine();

        this.simpleDict.add(word, translation);

    }

    //search method
    public void search() {
        System.out.print("To be translated: ");
        String word = this.scan.nextLine();

        if (this.simpleDict.translate(word) == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + this.simpleDict.translate(word));
        }
    }
}
