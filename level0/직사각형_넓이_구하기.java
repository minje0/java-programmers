package level0;

import java.util.Arrays;

public class 직사각형_넓이_구하기 {
    public static void main(String[] args) {
        int[][]dots={{1,4},{3,4},{3,10},{1,10}};
        Arrays.sort(dots);
        System.out.println(solution(dots));
    }
    public static int solution(int[][] dots) {
        int answer = 0;
        int a = Math.min(Math.min(dots[0][0], dots[1][0]), Math.min(dots[2][0], dots[3][0]));
        int b = Math.max(Math.max(dots[0][0], dots[1][0]), Math.max(dots[2][0], dots[3][0]));
        int c = Math.max(Math.max(dots[0][1], dots[1][1]), Math.max(dots[2][1], dots[3][1]));
        int d = Math.min(Math.min(dots[0][1], dots[1][1]), Math.min(dots[2][1], dots[3][1]));
        answer = Math.abs((a - b) * (c - d));
        return answer;
    }
}
