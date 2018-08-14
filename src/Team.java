import java.util.*;
import java.io.*;

public class Team {

    Player[] p = new Player[13]; //player objects to fill a team
    private int wins;
    private int losses;
    private int ties;
    Player highestScorer;
    String[] playerName = new String[13]; //every team has 13 players

    public Team(String filename) throws IOException {
        Scanner teamName = new Scanner(new File(filename + ".txt"));

        wins = 0;
        ties = 0;
        losses = 0;

        //loop to get player names from a file
        int i = 0;
        while (teamName.hasNext() && i < playerName.length) {
            playerName[i] = teamName.nextLine();
            i++;
        }

        //loop to create the player objects
        for (i = 0; i < p.length; i++) {
            p[i] = new Player(playerName[i]);
        }
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getTies() {
        return ties;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public Player highestScorer() {
        for (int i = 0; i < (p.length - 1); i++) {
            if (p[i].getAverage() > p[i + 1].getAverage()) {
                p[i] = highestScorer;
            }
        }
        return highestScorer;
    }

    public int totalPoints() {
        int totalPoints = 0;
        for (int i = 0; i < p.length; i++) {
            totalPoints = totalPoints + p[i].getPoints();
        }
        return totalPoints;
    }

    public void updateWins() {
        wins++;
    }

    public void updateTies() {
        ties++;
    }

    public void updateLosses() {
        losses++;
    }

    //use to decide which team won and which team lost
    public int compareTo(Team other) {
        if (this.totalPoints() > other.totalPoints()) {
            return 1;
        } else if (this.totalPoints() < other.totalPoints()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "The win/loss for this team was " + wins + " and " + losses + " with " + ties + " ties."
                + "\nThe highest scorer for this team was " + highestScorer.getName();
    }
}

