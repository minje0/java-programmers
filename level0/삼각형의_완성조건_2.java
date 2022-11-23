package level0;

public class 삼각형의_완성조건_2 {
    public static void main(String[] args) {
        int[] sides = {7, 11};
        int a = sides[0];
        int b = sides[1];
        int n = 0;
        if(a > b){
            for (int i = 0; i <= a; i++) {
                if (b + i > a) {
                    n++;
                }
            }
            n += b-1;
        }else {
            for (int i = 0; i <= b; i++) {
                if (a + i > b) {
                    n++;
                }
            }
            n += a-1;
        }
        System.out.println(n);
    }
}
