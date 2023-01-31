package CSDNTest;

public class Exercise {
    public static void main(String[] args) {
        int count = 0;// 数字九出现的次数
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 9) {
                count++;
            } else if (i / 10 % 10 == 9) {
                count++;
            }
        }
        System.out.println("数字九出现的次数" + count);
    }

}
