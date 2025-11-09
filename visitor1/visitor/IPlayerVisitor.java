package visitor;

import concreteElements.Player;
import concreteElements.Team;

public interface IPlayerVisitor {
    public void visitPlayer(Player player);
    public void visitTeam(Team team);
}