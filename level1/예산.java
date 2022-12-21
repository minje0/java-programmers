package level1;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        int budget = 9;
        int[] d = {1, 3, 2, 5, 4};
        Arrays.sort(d);
        int answer = 0;
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget == 0) {
                answer++;
                break;
            } else if (budget < 0) {
                break;
            } else {
                answer++;
            }
        }
        System.out.println(answer);
    }

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i : d) {
            budget -= i;
            if (budget == 0) {
                answer++;
                break;
            } else if (budget < 0) {
                break;
            } else {
                answer++;
            }
        }
        return answer;
    }
}

