package level2;

import java.util.Arrays;

public class 최솟값_만들기 {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int len = B.length;
        int j = len-1;
        for (int i = 0; i < len; i++) {
            answer += A[i] * B[j];
            j--;
        }

        return answer;
    }
}
