package concreteVisitors;

import concreteElements.Player;
import concreteElements.Team;
import visitor.IPlayerVisitor;

public class PayVisitor implements IPlayerVisitor {

    @Override
    public void visitPlayer(Player player) {
        double salary=player.getBaseSalary();
        salary+=player.getGoals() * 1000;

        System.out.println(player.getName() + " salary: " + salary);
    }

    @Override
    public void visitTeam(Team team) {
       
    }
}
