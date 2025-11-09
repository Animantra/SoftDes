package concretStrategy;

import strategy.IActionStrategy;

public class attackStrategy implements IActionStrategy {
    private String goOffencing= "attacking";
    
    @Override
    public String execute(){
        return goOffencing;
    }

    public void setOffenceType(String shootType){
        this.goOffencing=shootType;

    }
}
