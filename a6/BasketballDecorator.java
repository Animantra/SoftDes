<<<<<<< HEAD

public class BasketballDecorator extends StudentDecorator {

    public BasketballDecorator(iStudent student) {
        super(student);
    }

    @Override
    public String getDescription(){
        return student.getDescription() + ", playing basketball";
    }

}
=======

public class BasketballDecorator extends StudentDecorator {

    public BasketballDecorator(iStudent student) {
        super(student);
    }

    @Override
    public String getDescription(){
        return student.getDescription() + ", playing basketball";
    }

    @Override
    public String getRole(){
        return student.getRole();
    }

}
>>>>>>> 0fad5e642926447f12959c3a83bd6ec52c9de4de
