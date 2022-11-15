package weeklyMeeting.GroupStudies.Composition;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Student extends Person {
    private int studentId;
    private Book book; //has a relationship part

    public Book getBook() {

        return book;

    }

    public void setBook(Book book) {
        this.book = book;
    }
}

class Book {
    private String bookName;

    @Override
    public String toString() {
        return bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
