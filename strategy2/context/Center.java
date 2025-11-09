package context;

import strategy.IActionStrategy;

public class Center {
    private String name;
    private IActionStrategy iActionStrategy;
    private String defaultAct = "Playing in paint";

    public Center(String name){
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
