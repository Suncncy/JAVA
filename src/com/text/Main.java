package com.text;

//import entity.Person;//进行导入设置，将person改成*号，就是相当于导入entity的所有类
import entity.*;

import java.lang.module.ModuleDescriptor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;

import static java.awt.SystemColor.text;
import static java.math.RoundingMode.CEILING;

public class Main {
    public static void main(String[] args){
    StringBuilder builder=new StringBuilder();
    builder.append("AAA");
    builder.append("BBB");
    builder.append("CCC");
    builder.insert(2,11);//进行插入内容
    builder.delete(5,7);//删除内容
    System.out.println(builder.toString());
    String str=" Hello World ";
    System.out.println(str.strip());//删除字符串的前后空格
        System.out.println(str.stripLeading());//只去除前面的空格；
        System.out.println(str.isBlank());//进行判断字符串是否全部由空格组成
        System.out.println(str.repeat(2));//进行重复
String str2= """
        hhhhhhhh
        ddd
        """;//代码块
        System.out.println(str2);
String str3="zooooo";
System.out.println(str3.matches("o+"));//进行判断o是否出现了1次或者多次
        System.out.println(str3.matches("zo*"));//进行判断o是否出现了0次或者多次
        System.out.println(str3.matches("zo?"));//进行判断o是否出现了0次或者1次
        System.out.println(str3.matches("zo{5}"));//进行判断o是否出现了5次
        System.out.println(str3.matches("zo{2,}"));//进行判断o是否出现了2次以上
        System.out.println(str3.matches("zo{2,5}"));//进行判断o是否出现了2次以上，5次以下
        System.out.println(str3.matches("[A-z]{2,}"));//进行判断出现的字母是否出现了2次以上
    }


}


