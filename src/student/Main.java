package student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Harry", "Potter", "Gryffindor", 4.5);
        Aspirant aspirant = new Aspirant("Oliver", "Wood", "Gryffindor", 5.0, "Research Work");

        Student[] students = {student, aspirant};

        for (Student s : students) {
            System.out.println("Scholarship for " + s.getFirstName() + " " + s.getLastName() + ": $" + s.getScholarship());
        }
    }
}
