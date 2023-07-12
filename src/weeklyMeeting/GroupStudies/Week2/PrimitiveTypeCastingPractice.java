package weeklyMeeting.GroupStudies.Week2;

public class PrimitiveTypeCastingPractice {
    public static void main(String[] args) {
        /*Primitive Type Casting

        Convert from one primitive datatype to another

        order:  [SMALL] byte -> short -> int -> long -> float -> double [LARGE]*/

//        Widening casting (implicitly)
//        Going from a smaller datatype to a bigger datatype happens automatically

        int i = 40;
        long l = i;

//        Narrowing casting (explicitly)
//        Going from a bigger datatype to a smaller datatype needs manually casting

        //  Casting Formula:
       // smallerDatatype varName = (smallerDatatype) biggerDatatypeValue

        long ll = 100;
        int ii = (int) ll;

       /* Data loss:if you go from a bigger datatype to a smaller datatype and the smaller datatype cannot hold the value
        in the range there will be some data lost

        char <->int
        able to cast between these types*/

        long lll= 4455664555L;
        int iii= (int) lll;
        System.out.println(iii);
        double d1=12.05;
        int i4= (int) d1;
        System.out.println(i4);
        System.out.println(12/3+12.06/3);
        System.out.println(12/3+(int)(12.06/3));


    }
}
