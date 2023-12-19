package phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("87878887700", "Nokia", 237.2);
        Phone phone2 = new Phone("89994445566", "Lenovo", 256.8);
        Phone phone3 = new Phone("85553334455", "IPhone", 319.5);

        System.out.println(phone1.getNumber() + " " + phone1.getModel() + " " + phone1.getWeight());
        System.out.println(phone2.getNumber() + " " + phone2.getModel() + " " + phone2.getWeight());
        System.out.println(phone3.getNumber() + " " + phone3.getModel() + " " + phone3.getWeight());
        phone1.receiveCall("Anna");
        phone1.sendMessage("67858800757", "11111111111", "45645645456");
    }
}