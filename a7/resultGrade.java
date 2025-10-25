public class resultGrade implements iGradeStrategy{
    private String scholarship = "ura, stipendia";
    private String noScholarship = "bez stipendii";
    private String summerTrim = "letnik";

    @Override
    public String calcGrade(float finalScore){
        if(finalScore > 70){
            return scholarship;
        }
        else if(finalScore >= 50){
            return noScholarship;
        }
        else{
            return noScholarship + " " + summerTrim;
        }
        
    }


    
}
