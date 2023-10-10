package weeklyMeeting.GroupStudies.ArrayList;

public class ArrayListReview3 {

    public static void main(String[] args) {

        String str = "123";
        int num1 = Integer.parseInt(str); //  parse converts string to int  (primitive)
        Integer x = Integer.valueOf(str); //  valueOf converts string to  Integer (non-primitive)
        //If we need the primitive int datatype then Integer.parseInt() method is to be used.
          //      If Wrapper Integer object is needed then valueOf() method is to be used.


        String s2 = "10.5";
        double  num2= Double.parseDouble(s2);  // parse converts to double (primitive)
        Double y = Double.valueOf(s2); //valueOf converts to  Double (non-primitive)


        String s1 = "trueee";
        boolean r1 = Boolean.parseBoolean(s1);  // parse converts to boolean (primitive)
        Boolean z= Boolean.valueOf(s1); //valueOf converts to  Boolean (non-primitive)



        System.out.println("autoboxing and unboxing between primitive and non-primitive data type");
        System.out.println("valueOf between non-primitive and non-primitve");

        System.out.println(" from byte to BYTE ->   Autoboxing   ");           //between primitive and non-primitive
        System.out.println(" from BYTE to byte ->   unboxing     ");            //between primitive and non-primitive
        System.out.println("from byte to int    ->  primitive type casting_ implicit   "); // between primitive and primitive
        System.out.println("from int to byte   ->   primitive type casting_explicit  ");  // between primitive and primitive
        System.out.println("from non-primitive(String...) to int/double/boolean..    -> Parse method");    //between non-primitve to primitve
        System.out.println("from non-primitive(String...) to Integer/Double/Boolean.. ->  ValueOf Method");//between non-primitve to non-primitve


    }
}
