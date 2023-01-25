package level0;

public class 치킨_쿠폰 {
    public static void main(String[] args) {
        int chicken = 1081;
        int answer = 0;

        int coupon = chicken / 10;
        answer += coupon;
        int cou = chicken % 10;
        coupon += cou;

        while (true) {
            cou = coupon % 10;
            coupon = coupon / 10;

            answer += coupon;
            if (coupon == 0) {
                break;
            }
            coupon += cou;
        }
        System.out.println(answer);
    }
}
