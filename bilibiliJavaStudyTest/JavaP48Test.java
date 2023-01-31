package bilibiliJavaStudyTest;
import java.util.*;
public class JavaP48Test {
    public static void main(String[] args) {
        //定义一个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个5位数");
        int HuiwenNumber =sc.nextInt();


        int ge = HuiwenNumber % 10;//取个位
        int shi = HuiwenNumber /10%10;//取十位
        int bai = HuiwenNumber /100%10;//取百位
        int qian = HuiwenNumber /1000%10;//取千位
        int wan = HuiwenNumber /10000%10;//取万位


        int result = (ge*10000)+(shi*1000)+(bai*100)+(qian*10)+(wan);
        System.out.println(result);
        if(result==HuiwenNumber){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
