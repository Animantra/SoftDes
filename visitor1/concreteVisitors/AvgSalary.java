package concreteVisitors;

import concreteElements.Player;
import concreteElements.Team;
import visitor.IPlayerVisitor;

public class AvgSalary implements IPlayerVisitor{

    @Override
    public void visitPlayer(Player player) {
    }

    @Override
    public void visitTeam(Team team) {
        double base=0;
        int amount=0;
        for(Player p : team.getPlayers()){
            double salary = p.getBaseSalary();
            base+=salary;
            amount++;

        }
        double avg = base/amount;
        System.out.println("Average base salary for team : " + team.getName() + ": " + avg);
    }
}
