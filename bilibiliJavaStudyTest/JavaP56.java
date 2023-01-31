package bilibiliJavaStudyTest;

public class JavaP56 {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5 };

    // System.out.println(array[0]);
    // System.out.println(array[1]);
    // System.out.println(array[2]);
    // System.out.println(array[3]);
    // System.out.println(array[4]);
    // 利用循环改进代码
    // 开始条件：0
    // 结束条件：数组长度-1(最大索引）
    // 在Java当中，关于数组的一个长度属性,length
    // 调用方法：数组名称加上.length
    for (int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
    System.out.println(array.length);

  }
}
