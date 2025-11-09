package concreteElement;

import java.util.ArrayList;

import element.ISchoolElement;
import visitor.ISchoolVisitor;

public class Student implements ISchoolElement {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, int grade){
        this.name = name;
        this.grades = new ArrayList<>();
        this.grades.add(grade);
    }

    public void addGrade(int grade){
        grades.add(grade);
    }


    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public String getName(){
        return name;
    }

    @Override
    public void accept(ISchoolVisitor visitor) {
       visitor.visitStudent(this);
    }
    
}
