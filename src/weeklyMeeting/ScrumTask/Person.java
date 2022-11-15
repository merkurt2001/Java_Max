package weeklyMeeting.ScrumTask;

public class Person {

    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(name + " is eating" + food);
    }

    public void drink(String drink){
        System.out.println(name + " is eating" + drink);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


    /*
Create a class named Person
            variables:
                name, age, gender

            methods:
                eat(String food)
                drink(String drink)
                toString()
 */
}
