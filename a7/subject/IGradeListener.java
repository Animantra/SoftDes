package subject;

import observer.IGradeObserver;

public interface IGradeListener {
    public void subscribe(IGradeObserver observer);
    public void unsubscribe(IGradeObserver observer);
    public void notifyObservers(String studentName, int grade, String subjectName, String homework);
} 
