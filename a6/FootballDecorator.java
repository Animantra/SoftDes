<<<<<<< HEAD
public class FootballDecorator extends StudentDecorator {

    public FootballDecorator(iStudent student){
        super(student);
    }

    @Override
    public String getDescription(){
        return student.getDescription() + ", playing football";
    }

}
=======
public class FootballDecorator extends StudentDecorator {

    public FootballDecorator(iStudent student){
        super(student);
    }

    @Override
    public String getDescription(){
        return student.getDescription() + ", playing football";
    }

    @Override
    public String getRole(){
        return student.getRole();
    }
}
>>>>>>> 0fad5e642926447f12959c3a83bd6ec52c9de4de
