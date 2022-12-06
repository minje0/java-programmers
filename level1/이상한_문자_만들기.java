package level1;

public class 이상한_문자_만들기 {
    static String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        boolean chk = true;
        int cnt = 0;
        for (String ss : arr) {
            if (cnt % 2 == 0) {
                answer += ss.toUpperCase();
            } else {
                answer += ss.toLowerCase();
            }
            cnt++;
            if (ss.equals(" ")) {
                cnt = 0;
            }
        }

        return answer;
    }
}
