package level2;

import java.util.Arrays;

public class 최댓값과_최솟값 {
    public static void main(String[] args) {
        
    }
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("\\s");
        int len = arr.length;
        int[] intarr = new int[len];
        for (int i = 0; i < len; i++) {
            intarr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(intarr);
        answer += intarr[0];
        answer += " ";
        answer += intarr[len-1];
        
        return answer;
    }
}
