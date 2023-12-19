package animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Dog Food", "Living Room", "Labrador"),
                new Cat("Cat Food", "Bedroom", "White"),
                new Horse("Hay", "Stable", "Black")
        };

        Veterinary vet = new Veterinary();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            System.out.println("-----------");
        }
    }
}