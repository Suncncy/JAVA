package com.text;

//import entity.Person;//进行导入设置，将person改成*号，就是相当于导入entity的所有类
import entity.*;

public class Main{
    public static void main(String[] args)  {
 Order order1=new Order(1,"珍珠奶茶","南阳理工学院");
 Order order2=new Order(2,"草莓冰激凌","南阳理工学院");
 System.out.println(order1);
 System.out.println(order1.equals(order2));//这个比较的变量里面的内容
        System.out.println(order1.equals(order2));
    }
}