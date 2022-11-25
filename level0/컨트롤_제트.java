package level0;

import java.util.Stack;

public class 컨트롤_제트 {
    public static void main(String[] args) {
        String s = 	"10 Z 20 Z 1";
        //String s = "1 1 Z Z";
        System.out.println(solution(s));
    }
    public static int solution(String s) {
        int answer = 0;
        String[] str = s.split("\\s");
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("Z") && !stack.empty()) {
                    stack.pop();
            } else {
                stack.push(Integer.parseInt(str[i]));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}
