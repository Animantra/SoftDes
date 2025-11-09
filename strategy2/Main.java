import concretStrategy.attackStrategy;
import concretStrategy.defenceStrategy;
import context.Center;
import context.PointGuard;
import context.ShootGuard;
import strategy.IActionStrategy;

public class Main {
    public static void main(String[] args) {
    
        PointGuard pg = new PointGuard("Denis");
        ShootGuard sg = new ShootGuard("Arlan");
        Center c = new Center("Meirhan");

        System.out.println(pg.play());

        int scoreDifference = 8; 
        int timeLeftSecond = 25; 

        IActionStrategy attack = new attackStrategy();
        IActionStrategy def = new defenceStrategy();

        System.out.println("--Game situation--  ");

        if (scoreDifference < 0) {
            System.out.println("Team lags behind");
            pg.setStrategy(attack);
            sg.setStrategy(attack);
            c.setStrategy(attack);
        } else if (scoreDifference > 0 && timeLeftSecond < 30) {
            System.out.println("Team is leading and time is lefting");
            pg.setStrategy(def);
            sg.setStrategy(def);
            c.setStrategy(def);
        } 

        System.out.println("Players");
        System.out.println(pg.play());
        System.out.println(sg.play());
        System.out.println(c.play());
    }
}
