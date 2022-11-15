package weeklyMeeting.GroupStudies.Strings;

import java.util.Stack;

public class balanceParenthesis {
    public static void main(String[] args) {
          /*
        Balanced String. The program should find out if an input string is balanced or not.
        // isBalanced("[{()}]") - true
        // isBalanced("[({(})]") - false
        // isBalanced("{[}") - false
        // isBalanced("({}{}([{}]))") - true
        // isBalanced("({") - false
         */

        System.out.println(isBalanced("[({(})]"));
    }

    public static boolean isBalanced(String str){
        Stack<Character> repo = new Stack<>();
        for (int i=0; i<str.length(); i++) {

            if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
                repo.add(str.charAt(i));

            } else {

                if (repo.isEmpty()) {
                    return false;
                }

                char lastAdded = repo.pop();

                if (lastAdded == '{' && str.charAt(i) != '}') {
                    return false;
                } else if (lastAdded == '(' && str.charAt(i) != ')') {
                    return false;
                } else if (lastAdded == '[' && str.charAt(i) != ']') {
                    return false;
                }
            }
        }
        return repo.size()==0;
    }

}
