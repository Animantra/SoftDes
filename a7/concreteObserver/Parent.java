package concreteObserver;

import java.util.ArrayList;
import java.util.List;

import observer.IGradeObserver;

public class Parent implements IGradeObserver {
    private String name;
    private List<String> children = new ArrayList<>();

    public Parent(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void addChild(String childName){
        children.add(childName);
    }

    @Override
    public void update(String studentName, int grade, String subjectName, String homeWork) {
        if(children.contains(studentName)){
            if (children.contains(studentName)) {
            System.out.println("Parent " + name + " notified: your child " 
                + studentName + " got " + grade + " for " + subjectName 
                + ". Homework: " + homeWork);
        }
        }
    }
    
}
