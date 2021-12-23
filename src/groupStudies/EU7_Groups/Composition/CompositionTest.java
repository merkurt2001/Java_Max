package groupStudies.EU7_Groups.Composition;

public class CompositionTest {
    // Class 3
// Main class
// Main driver method
    public static void main(String[] args) {

        // Creating the objects of class 1 (Book class)
        // inside main() method
        Student bob = new Student();
        bob.setAge(12);
        bob.setName("BOB");

        Book book1 = new Book();
        book1.setBookName("Harry Potter");

        bob.setBook(book1);


        System.out.println(bob.getName() + " has " + bob.getBook());
    }
}
