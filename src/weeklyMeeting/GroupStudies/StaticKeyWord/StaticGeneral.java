package weeklyMeeting.GroupStudies.StaticKeyWord;

public class StaticGeneral {
   int x;
   static int y;

   public void instanceMethod () {
       System.out.println("from instance method");
       staticMethod();
       System.out.println(x);
       System.out.println(y);

   }

   public static void staticMethod(){
       System.out.println("from static method");
       System.out.println(y);
       //System.out.println(x);
//       instanceMethod(); we can not access

   }
}
