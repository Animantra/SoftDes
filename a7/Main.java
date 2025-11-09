import concreteObserver.Parent;
import concreteObserver.Student;
import concreteSubject.Teacher;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Math");

        Student student1 = new Student("Arlan", 15);
        Student student2 = new Student("Aruzhan", 16);

        Parent p1 = new Parent("Mrs. Gulnur");
        p1.addChild("Arlan");

        Parent p2 = new Parent("Mr. Denis");
        p2.addChild("Aruzhan");

        teacher1.subscribe(student1);
        teacher1.subscribe(student2);
        teacher1.subscribe(p1);
        teacher1.subscribe(p2);

        teacher1.unsubscribe(student2);
        teacher1.unsubscribe(p2);

        teacher1.giveGrade("Arlan", 5, "Solve pages 15, exercises 1-5");
        teacher1.giveGrade("Arlan", 5, "Solve pages 20, prepare for exam");

        teacher1.giveGrade("Aruzhan", 5, "Solve integrals, prepare for exam");


        student1.printAllGrades();
    }
    
}
