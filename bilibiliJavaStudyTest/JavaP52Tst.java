package bilibiliJavaStudyTest;
import java.util.*;
public class JavaP52Tst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个正整数");
        int number = sc.nextInt();
        //定义一个变量，标记number是否为一个质数
        //最初标记number为质数
        boolean flag = true;
        for(int i = 2;i<number;i++){
            if(number%i ==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(number+"是一个质数");
        }else {
            System.out.println(number+"不是一个质数");
        }
        

    }
}