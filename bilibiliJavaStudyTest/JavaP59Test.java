package bilibiliJavaStudyTest;

import java.util.Random;

public class JavaP59Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Random r = new Random();
        // 定义变量记录十个随机数总和
        int sum = 0;
        // 创建一个有10位的数组
        int[] arr = new int[10];
        // 循环获取十个1~100随机数，并将数组内元素总和赋值在sum上
        for (int i = 0; i < arr.length; i++) {
            int Gustnumber = r.nextInt(1, 100);
            arr[i] = Gustnumber;
            System.out.println("索引" + i + "的值" + arr[i]);
            sum = sum + arr[i];
        }
        System.out.println("十个随机数总和为" + sum);
        // 定义一个变量记录平均数
        int avg = sum / arr.length;
        System.out.println("平均数为" + avg);
        // 统计有几个数据比平均值12小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("有" + count + "个数字比平均值小");

    }
}
