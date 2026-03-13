package com.text;

//import entity.Person;//进行导入设置，将person改成*号，就是相当于导入entity的所有类
import entity.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;

import static java.awt.SystemColor.text;
import static java.math.RoundingMode.CEILING;

public class Main {
    public static void main(String[] args){
        test("AAA","BBB");
        String str="Hello World";
        String[] arr=str.split(" ");//字符串的分割
        char[] charArry=str.toCharArray();
        char[]chars=new char[]{'奥','利','奥'};
        String str2=new String(chars);
        System.out.println(str2);//将字符转换成字符串类型；
        System.out.println(Arrays.toString(charArry));//进行和char类型的字符转换
        System.out.println(Arrays.toString(arr));
        System.out.println(str.substring(6));//这个是将前面的字符进行切割掉
        System.out.println(str.substring(0,5));//这个是保留前面的字符
    }


private static void test(String...text){
    for (String s : text) {
        System.out.println(s);
        
    }

        }

}
