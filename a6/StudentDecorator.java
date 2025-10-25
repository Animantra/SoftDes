<<<<<<< HEAD
abstract class StudentDecorator implements iStudent {
    protected iStudent student;

    public StudentDecorator(iStudent student){
        this.student=student;
    } 

    @Override
    public String getDescription(){
        return student.getDescription();
    }

    @Override
    public String getRole(){
        return student.getRole();
    }

    @Override
    public void setRole(String role){
        student.setRole(role);
    }
}
=======
abstract class StudentDecorator implements iStudent {
    protected iStudent student;

    public StudentDecorator(iStudent student){
        this.student=student;
    } 

    @Override
    public String getDescription(){
        return student.getDescription();
    }

    @Override
    public String getRole(){
        return student.getRole();
    }

    @Override
    public void setRole(String role){
        student.setRole(role);
    }
}
>>>>>>> 0fad5e642926447f12959c3a83bd6ec52c9de4de
