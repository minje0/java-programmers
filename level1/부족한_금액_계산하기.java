package level1;

public class 부족한_금액_계산하기 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(solution(price, money, count));


    }
    public static long solution(int price, int money, int count) {
        long answer = 0;
        long result = 0;
        for (int i = 1; i <= count; i++) {
            result += price*i;
        }
        if (money < result) {
            answer = result - money;
        }
        return answer;
    }
}
