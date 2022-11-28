package level1;

public class 수박수박수박수박수박수 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }
    public static String solution(int n) {
        String answer = "";
        String su = "수";
        String bak = "박";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                answer += su;
            } else {
                answer += bak;
            }
        }
        return answer;
    }
}
