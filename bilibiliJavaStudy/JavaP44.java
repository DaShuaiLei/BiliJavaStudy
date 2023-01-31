package bilibiliJavaStudy;
/*

default的位置和省略
    1.位置
    2.省略
case穿透
 */
import java.util.*;
public class JavaP44 {
    public static void main(String[] args){
        int num = 1;
        switch (num) {
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
        }
        switch (num) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("输入的值错误");

        }

    }
}

