package visitor;

import concreteElement.Student;
import concreteElement.Teacher;

public interface ISchoolVisitor {
    public void visitTeacher(Teacher teacher);
    public void visitStudent(Student student);
    
}
