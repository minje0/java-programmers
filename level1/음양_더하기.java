package level1;

public class 음양_더하기 {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(solution(absolutes, signs));
    }
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int len = absolutes.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            if (signs[i]) {
                arr[i] = absolutes[i];
            }else {
                arr[i] = absolutes[i]*(-1);
            }
        }
        for (int i : arr) {
            answer += i;
        }
        return answer;
    }
}
