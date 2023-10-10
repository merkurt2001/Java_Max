package weeklyMeeting.GroupStudies.Constructor;

public class MyClass {

    int age;
    String name;

    public MyClass() {//no Parameterized Constructor
       this("Jhon");
    }

    public MyClass(String name) {
        this(name, 20);
    }

    public MyClass(String name, int age){//Parameterized Constructor
        this.age = age;
        this.name = name;
    }

    public MyClass(MyClass obj){//Copy Constructor
        this.name = obj.name;
        this.age = obj.age;
    }
}
