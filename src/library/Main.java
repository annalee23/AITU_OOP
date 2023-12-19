package library;

public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Harry Potter", "N12345", "Gryffindor", "31.07.1980", "123-123-12-12");
        readers[1] = new Reader("Draco Malfoy", "N456789", "Slytherin", "05.06.1980", "567-567-56-56");
        readers[2] = new Reader("Hermione Granger", "N0112233", "Gryffindor", "19.09.1979", "343-343-34-34");

        readers[0].takeBook(3);
        readers[1].takeBook("Magical Drafts and Potions", "Advanced Potion-Making");
        readers[2].takeBook("Intermediate Transfiguration", "A Guide to Advanced Transfiguration", "The Standard Book of Spells");

        readers[0].returnBook("Fantastic Beasts and Where to Find Them", "The Dark Forces: A Guide to Self-Protection");
        readers[1].returnBook(2);

    }
}
