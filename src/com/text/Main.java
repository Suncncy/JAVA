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
//密封类。标准的声明格式：public sealed【abstract】【class/inerface】 类名【extend 父类】【implements 接口，......】permits【子类，.....】{
//注意子类必须里面加final，sealed，或者no-sealed里面三个里面的一个
//eg：public sealed class A permits B(是指定B继承A）;