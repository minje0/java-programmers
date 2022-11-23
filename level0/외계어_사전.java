package level0;

import java.util.Collections;

public class 외계어_사전 {
    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        int answer = 2;
        for (int i = 0; i < dic.length; i++) {
            int count = 0;
            for (int j = 0; j < spell.length; j++) {
                if (countChar(dic[i], spell[j].charAt(0)) == 1) {
                    count++;
                }
            }
            if (count == spell.length) {
                answer = 1;
            }
        }
        System.out.println(answer);
    }
    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}

