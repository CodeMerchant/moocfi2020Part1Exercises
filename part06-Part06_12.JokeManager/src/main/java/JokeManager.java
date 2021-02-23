/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        Random draw = new Random();

        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            int index = draw.nextInt(this.jokes.size());

            String drawnJoke = this.jokes.get(index);
            return drawnJoke;
        }
    }

    public void printJokes() {
        for (String printJokes : this.jokes) {
            System.out.println(printJokes);
        }
    }
}
