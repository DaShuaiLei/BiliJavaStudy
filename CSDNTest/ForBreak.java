package CSDNTest;

import java.util.Scanner;

public class ForBreak {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    while (true) {
      System.out.println("请猜一个数字");
      double GuestNumber = sc.nextDouble();
      if (GuestNumber > 0.999 && GuestNumber <= 1) {
        System.out.println("循环次数" + count);
        System.out.println(GuestNumber);
        break;
      }
      count++;
    }
  }
}
