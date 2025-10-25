
public class Main {
    public static void main(String[] args) {
        iStudent denis = new BasicStudent("Denis");

        iStudent arlan = new SchoolTeamPlayer("Arlan");

        denis = new FootballDecorator(denis);
        System.out.println(denis.getDescription() + ' ' + denis.getRole());

        arlan = new BasketballDecorator(arlan);
        System.out.println(arlan.getDescription()+ ' ' + arlan.getRole());

        // denis.setRole("Team player");
        // System.out.println(denis.getDescription() + ' ' + denis.getRole());

        // StudentFacade facade=new StudentFacade();

        // facade.basicBasketballStudent("Denis");
        // facade.teamBasketballPlayer("Arlan");


    }

}
