<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        Imperial imp=new Imperial();
        
        imp.setFoot(7);
        imp.setInch(0);
        imp.setMile(100);
        imp.setPounds(400);

        iMetricSystem metric = new MetricAdapter(imp);

        System.out.println("Weight (kg): " + metric.getKilograms());
        System.out.println("Height (m): " + metric.getMeters());
        System.out.println("Distance (km): " + metric.getKilometers());
    }
    
}
=======
public class Main {
    public static void main(String[] args) {
        Imperial imp=new Imperial();
        
        imp.setFoot(7);
        imp.setInch(0);
        imp.setMile(100);
        imp.setPounds(400);

        iMetricSystem metric = new MetricAdapter(imp);

        System.out.println("Weight (kg): " + metric.getKilograms());
        System.out.println("Height (m): " + metric.getMeters());
        System.out.println("Distance (km): " + metric.getKilometers());
    }
    
}
>>>>>>> 0fad5e642926447f12959c3a83bd6ec52c9de4de
