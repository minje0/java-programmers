package level1;

import java.util.Arrays;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {

    }
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder answer = new StringBuilder(new String(arr));
        return answer.reverse().toString();
    }
}
