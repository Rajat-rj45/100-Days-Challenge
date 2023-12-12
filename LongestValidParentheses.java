import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        Stack<Integer> index=new Stack<>();
        index.add(-1);
        int maxlen=0;
        char c;
        for(int i =0;i<s.length();i++){
         c=s.charAt(i);
         if(c=='('){
            stack.add(c);
            index.add(i);
         }else{
            if(!stack.isEmpty() && stack.peek()=='('){
                stack.pop();
                index.pop();
                maxlen=Math.max(maxlen, i-index.peek());
            }else{
                index.add(i);
            }
         }
        }
        return maxlen;

        
    }
    
    public static void main(String[] args) {
        String s = "((()))(()";
        int result = longestValidParentheses(s);
        System.out.println("Length of the longest valid parentheses substring: " + result);
    }
}
