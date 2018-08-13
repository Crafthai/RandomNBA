public class Team {

    Player[] p = new Player[13];
    int wins;
    int losses;
    int ties;

    public Team() {
    for(int i = 0; i<p.length; i++){
        p[i] = new Player();
    }
    }
}

