package weeklyMeeting.GroupStudies.Questions;

import java.util.Stack;

public class brackets {
    public static void main(String[] args) {
        System.out.println("areBracketsBalanced( \"{[(  }])\") = " + areBracketsBalanced("{[(  )]}"));
    }

    public static boolean areBracketsBalanced(String expr){
        Stack<Character> stack = new Stack<>(); // will hold brackets inside

        for(int i=0; i < expr.length(); i++){
            char element = expr.charAt(i);
            if( element == '(' || element == '{' || element == '['){
                // push the element in the stack
                stack.push(element);
                continue;
            }

            // if the current element is not opening it means next element is closing
            // at this point if your stack is empty, it means you don't have balanced brackets
            if(stack.isEmpty()){
                return false;
            }

            char check;

            switch (element){
                case ')':
                    check = stack.pop(); //  takes the last element of stack and uses for checking
                    if(check == '{' || check == '['){   // try this logic with Map class
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '['){
                        return false;
                    }
                    break;
                case ']':
                    check = stack.pop();
                    if(check == '(' || check == '{'){
                        return false;
                    }
                    break;
            }

        }
        return (stack.isEmpty());
    }
}
