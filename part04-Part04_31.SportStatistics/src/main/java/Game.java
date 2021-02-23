/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author musa
 */
public class Game {

    private String hometeam;

    private String opposingteam;

    private int homepoints;

    private int opposingpoints;

    public Game(String hometeam, String opposingteam, int homepoints, int opposingpoints) {

        this.hometeam = hometeam;

        this.opposingteam = opposingteam;

        this.homepoints = homepoints;

        this.opposingpoints = opposingpoints;

    }

    public String getHomeTeam() {

        return hometeam;

    }

    public String getOpponent() {

        return opposingteam;

    }

    public boolean winnerIs(String team) {

        if (team.equalsIgnoreCase(hometeam) && homepoints > opposingpoints) {

            return true;

        }

        if (team.equals(opposingteam) && opposingpoints > homepoints) {

            return true;

        }

        return false;

    }

}
