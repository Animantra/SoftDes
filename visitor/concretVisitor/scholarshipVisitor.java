package concretVisitor;

import java.util.ArrayList;

import concreteElement.Student;
import concreteElement.Teacher;
import visitor.ISchoolVisitor;

public class scholarshipVisitor implements ISchoolVisitor {

    @Override
    public void visitTeacher(Teacher teacher) {
    }

    @Override
    public void visitStudent(Student student) {
        ArrayList<Integer> grades = student.getGrades();
        double total = 0;
        int amountGrades = grades.size();

        for(Integer g : grades){
            total += g;
        }

        double avg = total/amountGrades;
        double scholarship;
        if (avg >= 90) {
            scholarship = 57000;
        } else if (avg >= 70) {
            scholarship = 52000;
        } else {
            scholarship = 0;
        } 
        System.out.println("Student " + student.getName() +
                           " has average grade " + avg +
                           " and gets scholarship " + scholarship + "tenge");
    }
}
