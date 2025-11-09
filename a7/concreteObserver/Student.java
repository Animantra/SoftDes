<<<<<<< HEAD
package concreteObserver;

import observer.IGradeObserver;

public class Student implements IGradeObserver{
    private String name;
    private int age;
    private int grade;
    

    public Student(String name, int age){
        this.name=name;
        this.age=age;
        
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getGrade(){
        return grade;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }
    
    public void setGrade(int grade){
        this.grade=grade;
    }

    @Override
    public void update(String studentName, int grade, String subjectName, String homeWork) {
        if(studentName.equals(this.name)){
            System.out.println("Student " + name + " notified: grade " + grade +
                               " for subject " + subjectName + ". Homework : " + homeWork);
        }
    }

    
}
=======
package concreteObserver;

import java.util.ArrayList;
import java.util.List;

import observer.IGradeObserver;

public class Student implements IGradeObserver{
    private String name;
    private int age;
    private int grade;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, int age){
        this.name=name;
        this.age=age;
        
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getGrade(){
        return grade;
    }

    public List<Integer> getGrades(){
        return grades;
    }

    public int getLastGrade(){
        return grades.get(grades.size()-1);
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }
    
    public void setGrade(int grade){
        this.grade=grade;
    }

     public void printAllGrades() {
            System.out.println("Student " + name + " grades: " + grades);
    
    }

    @Override
    public void update(String studentName, int grade, String subjectName, String homeWork) {
        if(studentName.equals(this.name)){
            grades.add(grade);
            System.out.println("Student " + name + " notified: grade " + grade +
                               " for subject " + subjectName + ". Homework : " + homeWork);
        }
    }

    
}
>>>>>>> 6d3cbc3 (add)
