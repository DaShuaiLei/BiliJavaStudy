package bilibiliJavaStudyTest;

public class JavaP48Test3 {
    public static void main(String[] args) {
        int dividend = 15;//被除数
        int divisor = 2;//除数
        int temp = 0;//用作临时计数为商
        int end = 0;//定义最后被减的值
        int temp2 = 0;//临时第二个循环的控制变量
        //取得商
        while (dividend-divisor>=0) {
            divisor = divisor + 2;
            temp++;
        }

        for (; temp2 < temp; temp2++) {
            end = end + 2;
        }
        System.out.println("商为" + temp);
        System.out.println("余数为" + (dividend - end));
    }
}
