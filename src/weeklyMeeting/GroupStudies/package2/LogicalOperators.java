package weeklyMeeting.GroupStudies.package2;

public class LogicalOperators {
    public static void main(String[] args) {


//        boolean x = true;
//        System.out.println(!x);

        //============================================
        int a = 100;
        a -= 20 * 2;
        System.out.println("a = " + a);//60

//==========================================
        int b = 2;
        boolean res = ++b == 2 || --b == 2 && --b == 2; //false
/*                      3 == 2  || 2 == 2 &&    1 == 2
                         false   ||   true &&    false
* */
        System.out.println("res = " + res);

//===========================================
//        int x1 = 1;
//
//        System.out.println((x1 > 4) && (++x1 == 4));  //false
//        System.out.println(x1);  //1
//
//
//        System.out.println((x1 > 4) & (++x1 == 4));   //false
//        System.out.println(x1);  //2
//============================================

//        int x2 = 1;
//
//        System.out.println((x2 > 0) || (++x2 == 4));   //true
//        System.out.println(x2);  //1
//
//
//        System.out.println((x2 > 0) | (++x2 == 4));    //true
//        System.out.println(x2);  //2
//==============================================
        boolean x = true, z = true;
        int y = 20;

        x = (y != 10) || (z=false);

        System.out.println(x);

    }
}
