package Replit;

import java.util.Scanner;

public class route_Alternetive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter A,B,C or D");
        String start = scan.next();
        System.out.println("please enter A,B,C or D");
        String end = scan.next();

        String route= "";

        if(start.equals(end)){
            route = start + " found";
        }
        else{
            route = "Aright > Bdown > Cleft > Dup > Aright > Bdown > Cleft";
            if(route.indexOf(start)>route.indexOf(end)){
                route = route.substring(route.indexOf(start),route.lastIndexOf(end)-3);
            }else{
                route = route.substring(route.indexOf(start),route.indexOf(end)-3);
            }
            route = route.replace("A","");
            route = route.replace("B","");
            route = route.replace("C","");
            route = route.replace("D","");
            route += ": " + end + " found";
        }
        System.out.println(route);
    }
}
