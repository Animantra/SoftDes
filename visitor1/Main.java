import concreteElements.Player;
import concreteElements.Team;
import concreteVisitors.AvgSalary;
import concreteVisitors.PayVisitor;

public class Main{
    public static void main(String[] args) {

        Player denis = new Player("Denis",7, 20000);
        Player arlan = new Player("Arlan",15, 25000);
        Player meirhan = new Player("Meirhan",10, 20000);
        Player jenya = new Player("Jenya",12, 15000);

        Team t1 = new Team("Eagles");
        t1.addPlayer(denis);
        t1.addPlayer(arlan);
        t1.addPlayer(meirhan);
        t1.addPlayer(jenya);

        PayVisitor visitSalary = new PayVisitor();
        t1.accept(visitSalary);

        AvgSalary visitAvg = new AvgSalary();
        t1.accept(visitAvg);

    }
}

