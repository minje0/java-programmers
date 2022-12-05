package level2;

public class 이진_변환_반복하기 {
    public static void main(String[] args) {
        String str = "110010101001";
        int [] arr = solution(str);
        for (int i : arr){
            System.out.println(i);
        }

    }
    static int[] solution(String s) {
        int[] answer = new int[2];
        int cntTry = 0;
        int cntZero = 0;
        while (!s.equals("1")) {
            cntZero += cntChar(s);
            s = s.replaceAll("0", "");
            s = Integer.toBinaryString(s.length());
            cntTry++;
        }
        answer[0] = cntTry;
        answer[1] = cntZero;
        return answer;
    }

    public static int cntChar(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                count++;
            }
        }
        return count;
    }
}
