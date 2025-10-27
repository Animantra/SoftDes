package concreteStrategies;
import strategy.iGradeStrategy;

public class standardGrade implements iGradeStrategy {

    @Override
    public String calcGrade(float finalScore) {
        if(finalScore >=90){
            return "A";
        }
        else if(finalScore >=70){
            return "B";
        }
        else{
            return "F";
        }
    }
    
    
}
