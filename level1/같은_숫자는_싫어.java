package level1;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        int cnt = 0;
        for (int i : arr) {
            if (list.get(cnt) != i) {
                list.add(i);
                cnt++;
            }
        }
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
