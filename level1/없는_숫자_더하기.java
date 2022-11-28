package level1;

public class 없는_숫자_더하기 {
    public static void main(String[] args) {

    }
    public int solution(int[] numbers) {
        int answer = 45;
        for (int i : numbers) {
            answer -= i;
        }
        return answer;
    }
}
