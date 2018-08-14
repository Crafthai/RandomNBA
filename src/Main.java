import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Team atlanta = new Team("atlanta");
        Team boston = new Team("boston");
        Team brooklyn = new Team("brooklyn");
        Team charlotte = new Team("charlotte");
        Team chicago = new Team("chicago");
        Team cleveland = new Team("cleveland");
        Team dallas = new Team("dallas");
        Team denver = new Team("denver");
        Team detroit = new Team("detroit");
        Team goldenState = new Team("golden state");
        Team houston = new Team("houston");
        Team indiana = new Team("indiana");
        Team lac = new Team("lac");
        Team lal = new Team("lal");
        Team memphis = new Team("memphis");
        Team miami = new Team("miami");
        Team milwaukee = new Team("milwaukee");
        Team minnesota = new Team("minnesota");
        Team newOrleans = new Team("new orleans");
        Team newYork = new Team("new york");
        Team okc = new Team("oklahoma city");
        Team orlando = new Team("orlando");
        Team philly = new Team("philly");
        Team phoenix = new Team("phoenix");
        Team portland = new Team("portland");
        Team sacremento = new Team("sacremento");
        Team sanAntonio = new Team("san antonio");
        Team toronto = new Team("toronto");
        Team utah = new Team("utah");
        Team washington = new Team("washington");

        if(philly.compareTo(boston) < 0){
            philly.updateLosses();
            boston.updateWins();
        } else if(philly.compareTo(boston) > 0){
            philly.updateWins();
            boston.updateLosses();
        } else {
            philly.updateTies();
            boston.updateTies();
        }

        System.out.println("Philly: " + philly.toString());
        System.out.println("Boston: " + boston.toString());
    }
}
