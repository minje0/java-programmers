package level1;

import java.util.ArrayList;
import java.util.List;

public class 제일_작은_수_제거하기 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        int[] answer = solution(arr);
        for (int i : answer) {
            System.out.println(i);
        }
    }
    public static int[] solution(int[] arr) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int len = arr.length;
        if (len == 1) {
            list.add(-1);
        }else {
            for (int i : arr) {
                if (min > i) {
                    min = i;
                }
            }
            for (int i : arr) {
                if (i != min) {
                    list.add(i);
                }
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
