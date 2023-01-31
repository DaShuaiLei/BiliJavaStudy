package bilibiliJavaStudyTest;

public class JavaP58Test {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 555, 5453, 343 };
        int max = arr[0];
        // 循环获取最大值
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        // 求最小值
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
            }
            min = arr[i];
        }
        System.out.println(min);
    }
}
