package bilibiliJavaStudyTest;

public class JavaP45Test {
    public static void main(String[] args) {
        // Test
        for (int time = 5; time >= 1; time--) {
            System.out.println("在第" + time + "秒后自动重连");
            if (time == 3) {
                System.out.println("已经重连第三次");
            }

        }
    }
}
