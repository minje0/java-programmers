package level0;

public class 로그인_성공 {
    public static void main(String[] args) {
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        String[] id_pw = {"meosseugi", "1234"};
        System.out.println(solution(id_pw, db));
    }
    public static String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for (int i = 0; i < db.length; i++) {
            if (id_pw[0].equals(db[i][0])) {
                if (id_pw[1].equals(db[i][1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return answer;
    }
}
