package com.text;

//import entity.Person;//进行导入设置，将person改成*号，就是相当于导入entity的所有类
import entity.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import static java.math.RoundingMode.CEILING;

public class Main{
    public static void main(String[] args)  {
 //Integer i=Integer.valueOf(10);
 //Integer i=new Integer(10);
Integer i=666;//自动进行装箱机制,也可以自动进行拆箱，但是只限于基本数据类型
        Integer a=666;//等于的值一定得大于-128，小于127就会返回缓存
        Integer b=Integer.valueOf("6666666",16);//radix是进行进制转换的
        Integer c=Integer.decode("0xA1");//这个也是进行进制转换
            BigDecimal e=BigDecimal.valueOf(10);

            System.out.println(e.divide(BigDecimal.valueOf(3),100, RoundingMode.CEILING));//进行小数点后面的精确，可以确定精确的位数，也可以确定精确的方式
        System.out.println(c);
        System.out.println(b);
        System.out.println(a == i);
        BigInteger d=BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger result=d.multiply(d);
        System.out.println(result);
       // System.out.println(d.pow(100));这个是次方
        System.out.println(d.bitLength());//计算占的位数
    }
}
