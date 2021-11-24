package InterviewCodingTasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class hackerRank {

    public static void main(String[] args) {
        int sum=0;
        for (int i = 0, j=0; sum > 5 ; ++i, --j) {
            sum=sum+i+j;
        }
        System.out.println("sum : "+ sum);
        }
}




