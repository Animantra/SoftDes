public class MetricAdapter implements iMetricSystem {
    private Imperial imperial;

    public MetricAdapter(Imperial imperial) {
        this.imperial = imperial;
    }

    @Override
    public double getKilograms() {
        return imperial.getPounds() * 0.45359237;
    }

    @Override
    public double getMeters() {
        int totalInches = imperial.getFoot() * 12 + imperial.getInch();
        return totalInches * 0.0254;
    }

    @Override
    public double getKilometers() {
        return imperial.getMile() * 1.609344;
    }
}
    
