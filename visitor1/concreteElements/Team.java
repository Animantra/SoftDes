package concreteElements;

import java.util.ArrayList;
import java.util.List;

import element.IPlayerElement;
import visitor.IPlayerVisitor;

public class Team implements IPlayerElement {
    private String name;
    private List<Player> players = new ArrayList<>();

    public Team(String name){
        this.name=name;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public String getName(){
        return name;
    }

    public List<Player> getPlayers(){
        return players;
    }
    
    @Override
    public void accept(IPlayerVisitor visitor){
        for(Player p : players){
            p.accept(visitor);
        }
        visitor.visitTeam(this);

    }
    
}
