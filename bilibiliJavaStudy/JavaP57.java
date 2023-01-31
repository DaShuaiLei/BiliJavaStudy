package bilibiliJavaStudy;
import java.util.*;
public class JavaP57 {
    public static void main(String[] args) {
        //动态初始化格式:数据类型[] 数组名称 = new 数据类型[数组长度];
        //定义一个数组记录班级中50个人的姓名k
        //在动态初始化数组的时候，有我们自己给出数组的长的，有虚拟机给出默认的初始化值
        String[] arr = new String[50];
        //添加学生
        arr[0] = "张三";
        arr[1] = "李四";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        /*
        数组默认初始化值规律
        整数类型:默认初始化值为：0
        小数类型：默认初始化值为0.0
        字符类型：默认初始化值为：\u0000
        应用类型：默认初始化值为nullb
         */
        int[] test = new int[]{1,2,3,4,5};
        System.out.println(test[2]);
        //索引越界异常
        //原因:访问不存在的索引
        //知道索引的范围
        // 最小索引0，最大缩影：数组长度-1
    }
}