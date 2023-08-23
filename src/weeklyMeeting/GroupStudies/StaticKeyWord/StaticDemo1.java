package weeklyMeeting.GroupStudies.StaticKeyWord;

public class StaticDemo1 {

    StaticDemo1 sd = new StaticDemo1();

    void method1(){
        method4();
        StaticDemo1.method2();
//        StaticDemo1.method3(); -- this line gives compile error

    }

    static void method2(){

    }

    void method3(){
        method1();
        method2();
        sd.method2();
    }

    static void method4(){

    }
}
