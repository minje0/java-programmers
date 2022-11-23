package level0;

public class 캐릭터의_좌표 {
    public static void main(String[] args) {
        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};	//[2, 1]
        int lr = 0;
        int ud = 0;
        int lrMap = board[0]-1/2;
        int udMap = board[1]-1/2;
        for (String str : keyinput) {
            switch (str) {
                case "left":
                    if (lr > lrMap*-1) {
                        lr -= 1;
                    }break;
                case "right":
                    if (lr < lrMap) {
                        lr += 1;
                    }break;
                case "up":
                    if(ud < udMap){
                        ud += 1;
                    }break;
                case "down":
                    if (ud > udMap*-1) {
                        ud -= 1;
                    }break;
            }
        }
        System.out.println(lr);
        System.out.println(ud);
    }
}
