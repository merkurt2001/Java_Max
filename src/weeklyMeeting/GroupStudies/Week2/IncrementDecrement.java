package weeklyMeeting.GroupStudies.Week2;

public class IncrementDecrement {

    public static void main(String[] args) {


        int x = 4;
        int y = x * 4 - x++;
        System.out.println(y);//12
        System.out.println(x);//5
//===============================================
        int i = 11, j = 4;
        int res = i++ + --j;
        System.out.println("res = " + res);//14
// ==============================================
        int a = 50;
        int res3 = --a + a++ + a-- + a++;
/*
        a in memory ⇒ 50 → 49 → 50 → 49 → 50
        result ⇒           49 + 49 + 50 + 49 = 197
*/
        System.out.println("a = " + a);//50
        System.out.println("res = " + res3);//197
//=============================================
        int a1 = 1;
        int result = -a1-- + a1++ / -a1-- * --a1;
/*
        a in memory ⇒ 1 → 0 → 1 → 0 → -1
        result ⇒         -1 + 0 / -1 * -1 ⇒ -1 + 0 * -1 ⇒ -1 + 0 ⇒ -1
*/
        System.out.println("a1 = " + a1);//
        System.out.println("result = " + result);//


    }
}
