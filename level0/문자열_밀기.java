package level0;

public class 문자열_밀기 {
    public static void main(String[] args) {
        String A = "hello";
        String B = "elloh";
        System.out.println(solution(A, B));
    }
    public static int solution(String A, String B) {
        int answer = 0;
        int len = A.length();
        String AA = A;
        for (int i = 0; i < len; i++) {
            if (AA.equals(B)) {
                return answer;
            } else {
                AA = AA.substring(len - 1) + AA.substring(0, len - 1);
                answer++;
            }
        }
        return -1;
    }
}
