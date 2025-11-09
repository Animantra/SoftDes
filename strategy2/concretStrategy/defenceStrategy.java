package concretStrategy;

import strategy.IActionStrategy;

public class defenceStrategy implements IActionStrategy {
    private String goDefence = "defencing";

    @Override
    public String execute(){
        return goDefence;
    }

    public void setDefence(String deffenceType){
        this.goDefence=deffenceType;
    }
    
}
