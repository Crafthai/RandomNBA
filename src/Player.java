import java.util.*;

public class Player {

    private String name;
    private int[] points = new int[82];
    private double average;

    public Player(String name) {
        Random rand = new Random();

        this.name = name;
        for (int i = 0; i < points.length; i++) {
            points[i] = rand.nextInt(50);
        }
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        int i = -1;
        if (i > 82) {
            i = -1;
        }
        i++;
        return points[i];
    }

    public int totalPoints() {
        int totalPoints = 0;
        for (int i = 0; i < points.length; i++) {
            totalPoints = points[i] + totalPoints;
        }
        return totalPoints;
    }

    public double getAverage() {
        return average;
    }

    public void setPoints(int game, int points) {
        this.points[game] = points;
    }
}
