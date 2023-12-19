package animal;

public class Veterinary extends Animal{
    public void treatAnimal(Animal animal) {
        System.out.println("Food: " + animal.getFood() + ", Location: " + animal.getLocation());
    }
}
