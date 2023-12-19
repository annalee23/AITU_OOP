package library;

public class Reader {
    private String fullName;
    private String libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader() {}

    public Reader(String fullName, String libraryCardNumber, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }
    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }
    public String getFaculty() {
        return faculty;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getPhone() {
        return phone;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setLibraryCardNumber(String libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void takeBook (){
        System.out.println(fullName + " took a book.");
    }
    public void returnBook(){
        System.out.println(fullName + " returned a book.");
    }
    public void takeBook (int n){
        System.out.println(fullName + " took " + n + " books.");
    }
    public void takeBook (String... titles){
        System.out.print(fullName + " took books:");
        for (String s: titles) {
            System.out.print(" " + s + ";");
        }
        System.out.println();
    }
    public void returnBook(int n){
        System.out.println(fullName + " returned " + n + " books.");
    }
    public void returnBook(String... titles){
        System.out.print(fullName + " returned books:");
        for (String s: titles) {
            System.out.print(" " + s + ";");
        }
        System.out.println();
    }
}
