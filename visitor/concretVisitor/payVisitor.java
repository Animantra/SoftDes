package concretVisitor;

import concreteElement.Student;
import concreteElement.Teacher;
import visitor.ISchoolVisitor;

public class payVisitor implements ISchoolVisitor {

    @Override
    public void visitTeacher(Teacher teacher) {
        double salary = teacher.getPay() * teacher.getHours();
        System.out.println("Teacher : " + teacher.getName() + " gets pay " + salary + " tenge ");
    }

    @Override
    public void visitStudent(Student student) {
    }
}
