package level2;

public class 피보나치_수 {
    public static void main(String[] args) {
        int n = 4;
        int a = fibonacci(n);
        System.out.println(a);
    }

    public int solution(int n) {
        int answer[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                answer[i] = 0;
            } else if (i == 1) {
                answer[i] = 1;
            } else {
                int sum = answer[i - 2] + answer[i - 1];
                answer[i] = sum % 1234567;
            }
        }
        return answer[n];
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
