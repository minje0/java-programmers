package level1;

public class 삼3진법_뒤집기 {
    public static void main(String[] args) {
        int n = 45;
        String s = Integer.toString(n, 3);
        System.out.println(s);
        String ss = "";
        for (int i = s.length()-1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        System.out.println(ss);

        int nn =Integer.parseInt(ss,3);
        System.out.println(nn);
    }

    public int solution(int n) {
        int answer = 0;
        StringBuffer sb = new StringBuffer();
        String s = Integer.toString(n, 3);
        for (int i = s.length()-1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        s = sb.toString();
        answer = Integer.parseInt(s,3);
        return answer;
    }
}
