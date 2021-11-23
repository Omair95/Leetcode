import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid (String s) {
        if (s.length() % 2 != 0) return false;
        
        Stack<Character> valid = new Stack<>(); 
        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[')  valid.push(c);
            else if (c == ')' && !valid.isEmpty() && valid.peek() == '(') valid.pop();
            else if (c == '}' && !valid.isEmpty() && valid.peek() == '{') valid.pop();
            else if (c == ']' && !valid.isEmpty() && valid.peek() == '[') valid.pop();
            else return false;
        }

        return valid.isEmpty();
    }

    public static void main (String [] args) {
        String a = "()[]{}";
        String b = "(]";
        String c = "([}}])";

        System.out.println(isValid(a));
        System.out.println(isValid(b));
        System.out.println(isValid(c));
    }
}