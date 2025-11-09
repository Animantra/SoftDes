<<<<<<< HEAD
package concreteSubject;

import java.util.ArrayList;
import java.util.List;

import observer.IGradeObserver;
import subject.IGradeListener;

public class Teacher implements IGradeListener {
    private String subjectName;
    private List<IGradeObserver> observers = new ArrayList<>();
    
    public Teacher(String subjectName){
        this.subjectName=subjectName;
    }

    @Override
    public void subscribe(IGradeObserver observer) {
        observers.add(observer);
       
    }

    @Override
    public void unsubscribe(IGradeObserver observer) {
        observers.remove(observer);
       
    }

    @Override
    public void notifyObservers(String studentName, int grade, String subjectName, String homework) {
        for(IGradeObserver ob : observers){
            ob.update(studentName, grade, subjectName, homework);
        }
    }

    public void giveGrade(String studentName, int grade, String homework) {
        notifyObservers(studentName, grade, subjectName, homework);
    } 

    
}
=======
package concreteSubject;

import java.util.ArrayList;
import java.util.List;

import observer.IGradeObserver;
import subject.IGradeListener;

public class Teacher implements IGradeListener {
    private String subjectName;
    private List<IGradeObserver> observers = new ArrayList<>();
    
    public Teacher(String subjectName){
        this.subjectName=subjectName;
    }

    @Override
    public void subscribe(IGradeObserver observer) {
        observers.add(observer);
       
    }

    @Override
    public void unsubscribe(IGradeObserver observer) {
        observers.remove(observer);
       
    }

    @Override
    public void notifyObservers(String studentName, int grade, String subjectName, String homework) {
        for(IGradeObserver ob : observers){
            ob.update(studentName, grade, subjectName, homework);
        }
    }

    public void giveGrade(String studentName, int grade, String homework) {
        notifyObservers(studentName, grade, subjectName, homework);
    } 

    
}
>>>>>>> 6d3cbc3 (add)
