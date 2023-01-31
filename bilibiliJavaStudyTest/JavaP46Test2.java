package bilibiliJavaStudyTest;

public class JavaP46Test2 {
    public static void main(String[] args) {
        int temp = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(temp + i);
                temp += i;
            }
        }
    }
}
