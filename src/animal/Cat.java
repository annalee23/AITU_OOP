package animal;

public class Cat extends Animal{
    private String color;

    public Cat() {
        super();
    }
    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    @Override
    public void makeNoise() {
        System.out.println("The cat is meowing");
    }
    @Override
    public void eat() {
        System.out.println("The cat is eating " + getFood());
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping");
    }
}
