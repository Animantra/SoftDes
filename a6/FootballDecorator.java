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
