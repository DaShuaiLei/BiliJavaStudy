package bilibiliJavaStudy;

import java.util.*;

public class JavaP43 {
    public static void main(String[] args) {
        //获取想要吃的面的字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你想要吃的面");
        String noodles = sc.next();
        switch (noodles) {
            case "热干面":
                System.out.println("今天晚上吃武汉热干面");
                break;
            case "兰州拉面":
                System.out.println("今天晚上吃兰州拉面");
                break;
            case "担担面":
                System.out.println("晚上吃四川担担面");
                break;
            default:
                System.out.println("吃你的方便面去吧");
                break;
        }


    }
}
