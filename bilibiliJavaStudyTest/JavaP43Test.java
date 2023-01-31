package bilibiliJavaStudyTest;

import java.util.*;

public class JavaP43Test {
    public static void main(String[] args) {
        //运动计划
        Scanner sc = new Scanner(System.in);
        System.out.println("输入今天是周几，显示今天减肥活动");
        int sportDay = sc.nextInt();
        switch (sportDay) {
            case 1:
                System.out.println("今天我们来跑步吧");
                break;

            case 2:
                System.out.println("今天我们来游泳");
                break;

            case 3:
                System.out.println("今天我们的计划是慢走");
                break;

            case 4:
                System.out.println("今天我们来骑动感单车");
                break;

            case 5:
                System.out.println("今天打拳击");
                break;

            case 6:
                System.out.println("今天来爬山");
                break;

            case 7:
                System.out.println("今天我们来好好好吃一顿");
                break;

            default:
                System.out.println("星期输入错误");
                break;

        }
    }
}
