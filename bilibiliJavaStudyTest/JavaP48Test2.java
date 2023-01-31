package bilibiliJavaStudyTest;

import java.util.*;

public class JavaP48Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        //获取number作为原始数据
        int number = sc.nextInt();
        //定义一个变量记录你number原来的值,用于最后的比较
        int temp = number;
        //定义一个变量作为结果
        int end = 0;
        //利用循环从右往左获取一位数字
        //循环体是难点
        while (number != 0) {
            int ge = number % 10;//1234
            //修改number记录的值
            number /= 10;
            //当前获取的数字复制到最右边
            end = end * 10 + ge;
        }
          //打印end
        System.out.println(end);
        if (temp == end) {
            System.out.println("输入的数字是回文数");
        } else {
            System.out.println("输入的数字不是回文数");
        }

    }
}
