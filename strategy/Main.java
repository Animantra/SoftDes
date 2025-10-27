public class Main {
    public static void main(String[] args) {
        Student student = new Student("Denis");
        
        student.setStrategy(new standardGrade());
        System.out.println(student.calculate(85));

        student.setStrategy(new resultGrade());
        System.out.println(student.calculate(40));
    }
}
