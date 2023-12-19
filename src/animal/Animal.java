package animal;

public abstract class Animal {
        private String food;
        private String location;

        public Animal() {}
        public Animal(String food, String location) {
            this.food = food;
            this.location = location;
        }
        public String getFood() {return food;}
        public String getLocation() {return location;}
        public void setFood(String food) {this.food = food;}
        public void setLocation(String location) {this.location = location;}

        public void makeNoise() {
            System.out.println("The dog is eating " + food);
        }
        public void eat() {
            System.out.println("The animal is eating " + food);
        }
        public void sleep() {
            System.out.println("The animal is sleeping");
        }
}

