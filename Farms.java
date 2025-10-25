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



    // public Builder callBuilder(){
    //     return new Builder();
    // }
    
    private Farms(Builder builder) {
        this.name = builder.name;
        this.location = builder.location;
        this.horses = builder.horses;
        this.cows = builder.cows;
        this.sheep = builder.sheep;
        this.areaMeters = builder.areaMeters;
        this.priceTenge = builder.priceTenge;
    }

   


    public static  class Builder {
            private String name;
            private String location;
            private int horses;
            private int cows;
            private int sheep;
            private float areaMeters;
            private float priceTenge;
        

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setHorses(int horses) {
            this.horses = horses;
            return this;
        }

        public Builder setSheep(int sheep) {
            this.sheep = sheep;
            return this;
        }

        public Builder setCows(int cows) {
            this.cows = cows;
            return this;
        }

        public Builder setArea(float areaMeters) {
            this.areaMeters = areaMeters;
            return this;
        }

        public Builder setPrice(float priceTenge) {
            this.priceTenge = priceTenge;
            return this;
        }

         public Farms build(){
            return new Farms(this);
         }
    }
 }
