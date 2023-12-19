package animal;

public class Dog extends Animal{
    private String breed;

    public Dog() {
        super();
    }
    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    public String getBreed() {return breed;}
    public void setBreed(String breed) {this.breed = breed;}

    @Override
    public void makeNoise() {
        System.out.println("The dog is barking");
    }
    @Override
    public void eat() {
        System.out.println("The dog is eating " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping");
    }
}
