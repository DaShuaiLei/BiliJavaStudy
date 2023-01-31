package bilibiliJavaStudyTest;
//导包
import java.util.Random;
import java.util.Scanner;
public class JavaP53Test {
    public static void main(String[] args) {
        Random r = new Random();
        //小括号内写范围,输入100则为0~99
        //口诀包头不包尾，包左不包右
        //秘诀：生成任何数字到任何数字

        int number = r.nextInt(1,100);
        Scanner sc = new Scanner(System.in);
        //while条件永远为true，如果没有猜对进入break，则会一直循环获取数字，直到相等
        //注意事项：获取随机数不可以写在死循环内，否则每次循环都会改变随机数
        int count = 0;
        while(true) {
        System.out.println("请猜一个数字");
        int GuestNumber = sc.nextInt();
        count++;
            System.out.println("猜第"+count+"次");
            if (GuestNumber == number) {
                System.out.println("恭喜你，你猜对啦" + GuestNumber + "=" + number);
                break;
            }else if (GuestNumber > number) {
                System.out.println("猜的数字大了");
            } else if (GuestNumber < number) {
                System.out.println("猜的数字小了");
            }
            if(count ==3){
                System.out.println("失误三次，直接说明答案为"+number);
                break;
            }
        }
    }
}
