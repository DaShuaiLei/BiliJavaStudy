package bilibiliJavaStudyTest;

public class JavaP47Test {
    public static void main(String[] args) {
        //求一张0.1毫米的纸张要折多少次才能和珠穆朗玛峰8844430毫米一样高
        double Height = 8844430;
        double paper = 0.1;//定义纸张厚度
        int count = 0;//定义折纸的次数
        while (paper <= Height) {
            paper *= 2 ;//作用类似折纸的动作
            count++;//次数加一
        }
        System.out.println(count);//打印出次数有多少
    }
}
