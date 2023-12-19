package person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Anna", 18);
        person2.move();
        person2.talk();
    }
}
