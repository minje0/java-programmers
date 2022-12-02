package level2;

import java.util.Stack;



class 올바른_괄호 {
    public static void main(String[] args) {

    }
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            //여는 괄호일 때
            if(c == '('){
                stack.push(c);
            }

            //닫는 괄호일 때
            if(c == ')'){
                if(stack.size() == 0){
                    return false;
                }
                else stack.pop();
            }
        }
        if(stack.size() != 0) answer = false;

        return answer;
    }
}

