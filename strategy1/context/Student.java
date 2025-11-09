package context;
import strategy.iGradeStrategy;

public class Student {
    private String name;
    private iGradeStrategy iGradeStrategy;

    public Student(String name){
        this.name = name;
    }

    public void setStrategy(iGradeStrategy iGradeStrategy){
        this.iGradeStrategy = iGradeStrategy;
    }

    public String calculate(float finalScore){
        return name + " result: " + iGradeStrategy.calcGrade(finalScore);
    }    
}
