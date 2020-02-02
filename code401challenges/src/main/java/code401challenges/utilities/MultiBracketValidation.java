package code401challenges.utilities;
import java.util.Stack;

//got some help from https://www.techiedelight.com/iterate-over-characters-string-java/
//& form Daesy

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
        Stack<Character> current = new Stack<>();

        char[] inputChar = input.toCharArray();
        for(char ch: inputChar){
            if((ch == '(') || (ch == '{') || (ch == '[')){
                current.add(ch);
            }

            else if(ch == ')') {
                if(current.isEmpty() || current.pop() != '(' ) {
                    return false;
                }
            }

            else if(ch == '}') {
                if(current.isEmpty() || current.pop() != '{' ) {
                    return false;
                }
            }

            else if(ch == ']') {
                if(current.isEmpty() || current.pop() != '[' ) {
                    return false;
                }
            }

        }
        return current.isEmpty();

    }

}
