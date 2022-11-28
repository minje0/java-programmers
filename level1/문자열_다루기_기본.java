package level1;

import java.util.regex.Pattern;

public class 문자열_다루기_기본 {
    public boolean solution(String s) {
        boolean answer = false;
        String pattern = "^[0-9]*$";
        if (Pattern.matches(pattern, s)) {
            int len = s.length();
            if (len == 4 || len == 6) {
                answer = true;
            }
        }
        return answer;
    }
}
