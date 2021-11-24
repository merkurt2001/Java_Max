package Reviews.EU4_review;

class test1 {


     protected void method(){
         System.out.println("A");
    }

    private void method(int a){
        System.out.println("B");
    }
}



public class Test extends test1{


    public void method(int a){
        System.out.println("c");
    }

    public static void main(String[] args) {
        Test obj=new Test();
        obj.method();


    }
}
