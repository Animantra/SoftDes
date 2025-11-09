package context;

import strategy.IActionStrategy;

public class PointGuard {
    private String name;
    private IActionStrategy iActionStrategy;
    private String defaultAct = "Controlling ball";

    public PointGuard(String name){
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
