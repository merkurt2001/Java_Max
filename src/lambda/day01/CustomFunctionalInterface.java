package lambda.day01;

public class CustomFunctionalInterface {

    public static void main(String[] args) {

    StringFunctions longestString = (s1, s2) -> {
        if(s1.length() > s2.length())
            return s1;
        return s2;
    };

    // "java", "C#"

        System.out.println( longestString.function("Java", "C#") );

        System.out.println("------------------------------");

        DataFunction<String> reverse = (s) -> {
            String result = "";
            for(int i = s.length()-1; i >=0; i--)
                result += s.charAt(i);
            return result;
        };

       String str1 =  reverse.function("Cybertek");
        System.out.println(str1);

        System.out.println("-------------------------------");

        DataFunction<Integer> cube = n -> n*n*n ;

        int r1 = cube.function(10);
        System.out.println(r1);





    }
}
