package groupStudies.EU7_Groups.Inheritance;
class Parent{
    int parentVar=20;
    public Parent display(){
        System.out.println("coming from paretn");
        return new Parent();
    }
}
class Child extends Parent {
    int childVar=10;
    String x="child";
    @Override
    public Child display(){

        System.out.println("coming from child");

        return new Child();
    }
}
public class CoveriantType {
    public static void main(String[] args) {
        Parent obj=new Parent();
        Child obj1=new Child();
        Parent obj3=obj.display();
        System.out.println("obj3.x = " + obj3.parentVar);
        System.out.println("obj1.childVar = " + obj1.childVar);
        System.out.println(obj.display());
        System.out.println(obj.display());




    }
}
