package bilibiliJavaStudyTest;

import java.util.*;

public class JavaP44Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天是星期几");
        int weekDay = sc.nextInt();
        switch (weekDay) {

            case 1, 2, 3, 4, 5 -> System.out.println("今天是工作日");
            case 6, 7 -> System.out.println("今天是休息日");
            default -> System.out.println("没有这个星期");
        }
        // Test

        System.out.println("1机票查询");
        System.out.println("2机票预订");
        System.out.println("3机票改签");
        System.out.println("4推出服务");
        System.out.println("选择一种服务");
        int tele = sc.nextInt();
        switch (tele) {
            case 1 -> System.out.println("您选择了查询机票");
            case 2 -> System.out.println("您选择了机票预定");
            case 3 -> System.out.println("您选择了机票改签");
            default -> System.out.println("您选择了退出服务");
        }

    }
}
