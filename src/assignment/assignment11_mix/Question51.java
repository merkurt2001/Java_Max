package assignment.assignment11_mix;

import java.util.Arrays;
import java.util.Scanner;

public class Question51 {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter inner size:");
		int sizeInner = scan.nextInt();
		
		System.out.println("Enter outer size:");
		int sizeOuter = scan.nextInt();
		
		int[] inner = new int[sizeInner];
		int[] outer = new int[sizeOuter];
		
		for(int i =0; i < sizeInner; i++) {
			inner[i] = scan.nextInt();
		}
		
		for(int j =0; j < sizeOuter; j++) {
			outer[j] = scan.nextInt();
		}
		
		Arrays.sort(inner);
		Arrays.sort(outer);
			
		int count = 0;

		for (int i = 0; i < inner.length; i++) {
			for (int j = 0; j < outer.length; j++) {
				if (inner[i] == outer[j]) {
					count++;
					break;
				}
			}
		}

		if (count == inner.length) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}

	}

}
