package concreteStrategies;
import strategy.iGradeStrategy;

public class resultGrade implements iGradeStrategy{
    private String scholarshipText = "ura, stipendia";
    private String noScholarshipText = "bez stipendii";
    private String summerTrimText = "letnik";

    @Override
    public String calcGrade(float finalScore){
        if(finalScore >= 70){
            return scholarshipText;
        }
        else if(finalScore >= 50){
            return noScholarshipText;
        }
        else{
            return noScholarshipText + " " + summerTrimText;
        }
        
    }

    public void setScholarship(String scholarshipText){
        this.scholarshipText=scholarshipText;
    }

     public void setNoScholarship(String noScholarshipText){
        this.noScholarshipText=noScholarshipText;
    }

     public void setSumTrim(String summerTrimText){
        this.summerTrimText=summerTrimText;
     }
    
}
