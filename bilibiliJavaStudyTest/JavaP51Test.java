package bilibiliJavaStudyTest;

import java.util.*;

public class JavaP51Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个大于等于2的整数x");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i * i == number) {
                System.out.println(number + "的平方根是" + i);
                //一旦找到，就会立马停止，提高效率
                break;
            } else if (i * i > number) {
                System.out.println(number + "的平方根整数部分是" + (i - 1));
                break;
            }

        }
    }
}
