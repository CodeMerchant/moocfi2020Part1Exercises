
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        ArrayList<String> teamsRecords = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner read = new Scanner(Paths.get(file))) {

            while (read.hasNextLine()) {
                String row = read.nextLine();

                String[] splitText = row.split(",");
                String homeTeam = splitText[0];
                String awayTeam = splitText[1];
                int homePoints = Integer.valueOf(splitText[2]);
                int awayPoints = Integer.valueOf(splitText[3]);

                if (homeTeam.equals(teamName) || awayTeam.equals(teamName)) {
                    gamesPlayed++;

                    if (homeTeam.equals(teamName) && homePoints > awayPoints) {
                        wins++;
                    } else if (awayTeam.equals(teamName) && awayPoints > homePoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }

            }
        } catch (Exception e) {

        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

    /*
            Scanner scan = new Scanner(System.in);

 

        System.out.println("File: ");

        String fileName = scan.nextLine();

 

        ArrayList<Game> games = readFromFile(fileName);

        System.out.println("Team: ");

        String team = scan.nextLine();

 

        // Count only the matches of the specified team

        ArrayList<Game> gamesOfATeam = new ArrayList<>();

        for (Game game : games) {

            if (team.equals(game.getHomeTeam()) || team.equals(game.getOpponent())) {

                gamesOfATeam.add(game);

            }

        }

 

        // print the number of games

        System.out.println("Games: " + gamesOfATeam.size());

 

        // count the number of wins

        int wins = 0;

        for (Game game : gamesOfATeam) {

            if (game.winnerIs(team)) {

                wins++;

            }

        }

        System.out.println("Wins: " + wins);

        System.out.println("Losses: " + (gamesOfATeam.size() - wins));

 

    }

 

    public static ArrayList<Game> readFromFile(String fileName) {

        ArrayList<Game> games = new ArrayList<>();

 

        try (Scanner scan = new Scanner(Paths.get(fileName))) {

            while (scan.hasNextLine()) {

                String line = scan.nextLine();

                if (line.isEmpty()) {

                    continue;

                }

 

                String[] parts = line.split(",");

 

                String homeTeam = parts[0];

                String opposingTeam = parts[1];

 

                int homePoints = Integer.valueOf(parts[2]);

                int opposingPoints = Integer.valueOf(parts[3]);

 

                games.add(new Game(homeTeam, opposingTeam, homePoints, opposingPoints));

            }

        } catch (Exception e) {

            System.out.println("Failed to read from file.");

        }

 

        return games;

 

    }

}

     */
}
