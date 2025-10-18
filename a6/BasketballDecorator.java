
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
