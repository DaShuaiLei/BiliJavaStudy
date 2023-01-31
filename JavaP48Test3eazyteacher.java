package bilibiliJavaStudyTest;

public class JavaP48Test3eazyteacher {
    public static void main(String[] args) {
        //定义变量记录被除数
        int dividend = 17;
        //定义变量就除数
        int divisor = 3;
        //定义一个变量记录商
        int count = 0;
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("计算结果商为" + count);
        System.out.println("余数为" + dividend);
    }
}
