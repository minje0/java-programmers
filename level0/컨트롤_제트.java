package level0;

public class 컨트롤_제트 {
    public static void main(String[] args) {
        String s = "1 1 Z Z";
        System.out.println(solution(s));
    }
    public static int solution(String s) {
        int answer = 0;
        String [] str = s.split("\\s");
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals("Z")){
                if (i == 0) {
                    continue;
                }
                else if(str[i-1].matches("-?\\d+")) {
                    answer -= Integer.parseInt(str[i-1]);
                }
            }else{
                answer += Integer.parseInt(str[i]);
            }

        }
        return answer;
    }
}
