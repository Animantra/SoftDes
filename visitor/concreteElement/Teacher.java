package concreteElement;


import element.ISchoolElement;
import visitor.ISchoolVisitor;

public class Teacher implements ISchoolElement {
    private String name;
    private double hourlyPay;
    private int hoursTaught;
   
    public Teacher(String name, double hourlyPay, int hoursTaught){
        this.name = name;
        this.hourlyPay = hourlyPay;
        this.hoursTaught = hoursTaught;
    }

    public String getName(){
        return name;
    }

    public double getPay(){
        return hourlyPay;
    }

    public int getHours(){
        return hoursTaught;
    }

    @Override
    public void accept(ISchoolVisitor visitor) {
        visitor.visitTeacher(this);
    }
    
    
}
