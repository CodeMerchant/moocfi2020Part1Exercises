/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class UserInterface {

    private Container container;
    private Container container2;
    private Scanner scan;

    public UserInterface(Container conOne, Container conTwo, Scanner scan) {
        this.container = conOne;
        this.container2 = conTwo;
        this.scan = scan;

    }

    public void start() {
        System.out.println("First: " + this.container.toString());
        System.out.println("Second: " + this.container2.toString());
        while (true) {
            String input = this.scan.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int liquidAmount = Integer.valueOf(parts[1]);

            command(command, liquidAmount);

            System.out.println("First: " + this.container.toString());
            System.out.println("Second: " + this.container2.toString());

        }
    }

    public void command(String command, int liquidAmount) {
        if (command.equalsIgnoreCase("add")) {
            add(liquidAmount);
        } else if (command.equalsIgnoreCase("move")) {
            move(liquidAmount);
        } else if (command.equalsIgnoreCase("remove")) {
            remove(liquidAmount);
        }
    }

    public void add(int amount) {
        this.container.add(amount);
    }

    public void move(int amount) {
        if (amount > 0) {
            if (amount > this.container.contains()) {
                this.container2.add(this.container.contains());
                this.container.remove(amount);
            } else {
                this.container.remove(amount);
                this.container2.add(amount);
            }
        }
    }

    public void remove(int amount) {
        this.container2.remove(amount);
    }

}
