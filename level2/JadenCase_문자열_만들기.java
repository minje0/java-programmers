package level2;

public class JadenCase_문자열_만들기 {
    public static void main(String[] args) {
        String s = "a aa ";
        System.out.println(solution(s));
        String ss = " a  aa ";
        System.out.println(solution(ss));
    }

    public static String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }
}
