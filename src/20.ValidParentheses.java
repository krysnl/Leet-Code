import java.util.Stack;

public class 20.ValidParentheses{

    public static void main(String[] args) {
        String strs = "}";
        System.out.println(isValid(strs));

    }

    public static boolean isValid(String s) {
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i<s.length() ; i++){
            switch (s.charAt(i)) {
                case '(' :
                    stack.push(1);
                    break;
                case ')':
                    if(stack.isEmpty())
                        return false;
                    if(stack.peek() == 1)
                        stack.pop();
                    else
                        return false;
                    break;
                case '[' :
                    stack.push(2);
                    break;
                case ']':
                    if(stack.isEmpty())
                        return false;
                    if(stack.peek() == 2)
                    stack.pop();
                    else
                        return false;
                    break;
                case '{' :
                    stack.push(3);
                    break;
                case '}':
                    if(stack.isEmpty())
                        return false;
                    if(stack.peek() == 3)
                        stack.pop();
                    else
                        return false;
                    break;
            }
        }


        if(stack.isEmpty())
        return true;

        return false;
    }
}
