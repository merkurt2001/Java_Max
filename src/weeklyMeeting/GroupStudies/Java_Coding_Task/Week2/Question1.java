package weeklyMeeting.GroupStudies.Java_Coding_Task.Week2;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    //Numbers -- Divisible by 3, 5, 15
    public static void main(String[] args) {

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";


//        for (int i = 1; i < 100; i++) {
//            if (i % 15 == 0 )
//                divisibleBy15 += i + " ";
//            if (i % 5 == 0 && i % 15 != 0)
//                divisibleBy5 += i + " ";
//            if (i % 3 == 0 && i % 15 != 0)
//                divisibleBy3 += i + " ";
//        }

//        System.out.println("Divisible By 15: " + divisibleBy15);
//        System.out.println("Divisible By 5: " + divisibleBy5);
//        System.out.println("Divisible By 3: " + divisibleBy3);

        //second approach
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 100 ; i++) {
            list.add(i);
        }

        System.out.print("Divisible by 15 ");
        System.out.print("Divisible By 15: ");
        list.forEach( p -> { if(p%15==0 ) System.out.print(p+" "); } ) ;
        System.out.print("\nDivisible By 5: ");
        list.forEach( p -> { if(p%5==0 && p%15!=0) System.out.print(p+" "); } ) ;
        System.out.print("\nDivisible By 3: ");
        list.forEach( p -> { if(p%3==0 && p%15!=0) System.out.print(p+" "); } ) ;



    }

}


