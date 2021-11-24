package groupStudies.EU6_Groups.package5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class getDuplicate {

	public static void main(String[] args) {
		//if there is any element is duplicated, the method counts how many of those present in the array
		String[] str1 = {"1","2","aa","1","aa"}; //1,1,aa,aa---4
		String[] str2 = {"1","2","aa","1"}; // 1,1---2
		String[] str3 = {"1","g","aabb","7","7","2","aa","7"};//7,7,7----3
		String[] str4 = {"a","d","a","a","a","d"}; // a,a,a,a,d,d----6
		
		System.out.println(getDup(str1));
		System.out.println(getDup(str2));
		System.out.println(getDup(str3));
		System.out.println(getDup(str4));
	}

	public static int getDup(String[] array) {
        int maxDublicate = 0;
        
        for (int i = 0; i < array.length; i++) {
            boolean haveTwin = false;
            for (int j = 0; j < array.length; j++) {
                if (i == j) continue;

                if (array[i].equals(array[j])) {
                    haveTwin = true;
                    break;
                }
            }
            if (haveTwin) maxDublicate++;
        }
        return maxDublicate;
    }
}
