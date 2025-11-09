import concretVisitor.payVisitor;
import concretVisitor.scholarshipVisitor;
import concreteElement.Student;
import concreteElement.Teacher;

public class Main {
    public static void main(String[] args) {
        Student arlan = new Student("Arlan", 80);
        Student denis = new Student("Denis", 100);
        arlan.addGrade(70);
        denis.addGrade(90);

        Teacher mrMeirhan = new Teacher("Meirhan", 3000, 10);
        Teacher msKarina = new Teacher("Karina", 5000, 11);

        scholarshipVisitor sch = new scholarshipVisitor();
        payVisitor pay = new payVisitor();

        arlan.accept(sch);
        denis.accept(sch);

        mrMeirhan.accept(pay);
        msKarina.accept(pay);

    }
}
