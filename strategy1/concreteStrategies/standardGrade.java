package concreteStrategies;
import strategy.iGradeStrategy;

public class standardGrade implements iGradeStrategy {
    private String gradeA="A";
    private String gradeB="B";
    private String gradeF="F";

    @Override
    public String calcGrade(float finalScore) {
        if(finalScore >=90){
            return gradeA;
        }
        else if(finalScore >=70){
            return gradeB;
        }
        else{
            return gradeF;
        }
    }

    public void setGradeA(String gradeA){
        this.gradeA=gradeA;
    }
    
    public void setGradeB(String gradeB){
        this.gradeB=gradeB;
    }

    public void setGradeF(String gradeF){
        this.gradeF=gradeF;
    }

}
