public class StudentFacade {

    public void basicBasketballStudent(String name){
        iStudent student= new BasketballDecorator(new BasicStudent(name));
        System.out.println(student.getDescription() + " " + student.getRole());


    }

    public void teamBasketballPlayer(String name){
        iStudent student= new BasketballDecorator(new SchoolTeamPlayer(name));
        System.out.println(student.getDescription() + " " + student.getRole());
    }

    
}
