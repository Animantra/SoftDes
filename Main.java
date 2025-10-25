public class Main {
    public static void main(String[] args) {


        Farms vkusnoFerma = new Farms.Builder()
                //.callBuilder()
                .setName("VKUSNO FERMA")
                .setLocation("SKO")
                .setHorses(20)
                .setCows(50)
                .setSheep(200)
                .setArea(500)
                .setPrice(1500000)
                .build();

       Farms NaturalProd = new Farms.Builder()
                //.callBuilder()
               .setName("Prod")
               .setLocation("Moscow")
               .setHorses(20)
               .setCows(50)
               .setSheep(300)
               .setArea(500)
               .setPrice(2500000)
               .build();

        System.out.println(vkusnoFerma);

        System.out.println(NaturalProd);
    }
}