package bilibiliJavaStudyTest;

public class JavaP49Test {
    public static void main(String[] args) {
        int bag = 5;
        for (int i = 1; i <= bag; i++) {
            System.out.println("第" + i + "个包子真好吃");
            if (i > 3) {
                System.out.println("小老虎吃饱了");
                break;
            }
        }
    }
}

