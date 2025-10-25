public class Student {
    private String name;
    private iGradeStrategy iGradeStrategy;

    public Student(String name, iGradeStrategy iGradeStrategy){
        this.name = name;
        this.iGradeStrategy = iGradeStrategy;
    }

    public void setStrategy(iGradeStrategy iGradeStrategy){
        this.iGradeStrategy = iGradeStrategy;
    }

    public String calculate(float finalScore){
        return name + " fate: " + iGradeStrategy.calcGrade(finalScore);
    }    
}
