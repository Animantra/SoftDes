package concreteElements;

import element.IPlayerElement;
import visitor.IPlayerVisitor;

public class Player implements IPlayerElement {
    private String name;
    private int totalGoals;
    private double baseSalary;

    public Player(String name,int totalGoals,double baseSalary){
        this.name=name;
        this.totalGoals=totalGoals;
        this.baseSalary=baseSalary;
    }

    public String getName(){
        return name;
    }
    public int getGoals(){
        return totalGoals;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    @Override
    public void accept(IPlayerVisitor visitor) {
        visitor.visitPlayer(this);

    }

}
