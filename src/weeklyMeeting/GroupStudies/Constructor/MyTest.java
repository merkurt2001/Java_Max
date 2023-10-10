package weeklyMeeting.GroupStudies.Constructor;

public class MyTest {

    public static void main(String[] args) {

        MyClass student1 = new MyClass("Mike", 21);
        System.out.println(student1.name);
        System.out.println(student1.age);

        MyClass student2 = new MyClass();
        System.out.println(student2.name);
        System.out.println(student2.age);

        MyClass copyStudent = new MyClass(student2);
        System.out.println(copyStudent.name);
        System.out.println(copyStudent.age);

    }
}
