package phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {}

    public String getNumber() {
        return number;
    }
    public String getModel() {
        return model;
    }
    public double getWeight() {
        return weight;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall (String name) {
        System.out.println(name + " is ringing");
    }
    public void receiveCall (String name, String number) {
        System.out.println(name + " " + number + " is ringing");
    }
    public void sendMessage (String... nums) {
        for (String s: nums) {
            System.out.println(s);
        }
    }
}
