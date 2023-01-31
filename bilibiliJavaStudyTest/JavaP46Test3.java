package bilibiliJavaStudyTest;

import java.util.*;

public class JavaP46Test3 {
  public static void main(String[] args) {
    /*
     * 题目为获取两个数字，求范围内能同时被3和5整除的数的个数
     */
    // 获取两个数字
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入第一个数字表示开始");
    int start = sc.nextInt();

    System.out.println("请输入第二个数字表示结束");
    int end = sc.nextInt();
    int count = 0;
    // 利用循环获取范围之间的数字
    for (; start <= end; start++) {
      if (start % 3 == 0 && start % 5 == 0) {
        System.out.println("能同时被3和5整除的数字" + start);
        count++;
      }
    }
    // 打印出能被整除的次数
    System.out.println("有" + count + "个能同时被3和5整除的数的个数");
  }
}
