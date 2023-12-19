package animal;

public class Horse extends Animal {
    private String maneColour;

    public Horse() {
        super();
    }
    public Horse(String food, String location, String maneColour) {
        super(food, location);
        this.maneColour = maneColour;
    }

    public String getManeColour() {return maneColour;}
    public void setManeColour(String maneColour) {this.maneColour = maneColour;}

    @Override
    public void makeNoise() {
        System.out.println("The horse is neighing");
    }
    @Override
    public void eat() {
        System.out.println("The horse is eating " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("The horse is sleeping");
    }
}
