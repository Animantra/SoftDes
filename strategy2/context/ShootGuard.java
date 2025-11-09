package context;

import strategy.IActionStrategy;

public class ShootGuard {
    private String name;
    private IActionStrategy iActionStrategy;
    private String defaultAct = "Scoring from distance";

    public ShootGuard(String name){
        this.name=name;
    }

    public void setStrategy(IActionStrategy iActionStrategy){
        this.iActionStrategy=iActionStrategy;
    }

    public String play(){
        if(iActionStrategy==null){
            return defaultAct;
        }
        else{
            return name + ' ' + iActionStrategy.execute();
        }

    }
    
}
