public class Farms {
    private String name;
    private String location;
    private int horses;
    private int cows;
    private int sheep;
    private float areaMeters;
    private float priceTenge;


    public String toString() {
        return name + "," + ' '
                + location + "," + ' '
                + horses + "," + ' '
                + cows + "," + ' '
                + sheep + "," + ' '
                + areaMeters + " m^2 " + "," + ' '
                + priceTenge + " tenge ";
    }

    public Builder callBuilder(){
        return new Builder();
    }


    public class Builder {
    
        public Builder setName(String name) {
            Farms.this.name = name;
            return this;
        }

        public Builder setLocation(String location) {
            Farms.this.location = location;
            return this;
        }

        public Builder setHorses(int horses) {
            Farms.this.horses = horses;
            return this;
        }

        public Builder setSheep(int sheep) {
            Farms.this.sheep = sheep;
            return this;
        }

        public Builder setCows(int cows) {
            Farms.this.cows = cows;
            return this;
        }

        public Builder setArea(float areaMeters) {
            Farms.this.areaMeters = areaMeters;
            return this;
        }

        public Builder setPrice(float priceTenge) {
            Farms.this.priceTenge = priceTenge;
            return this;
        }

        public Farms build() {
            return Farms.this;
        }
    }
}
