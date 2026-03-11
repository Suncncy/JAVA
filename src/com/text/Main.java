package com.text;

//import entity.Person;//进行导入设置，将person改成*号，就是相当于导入entity的所有类
import entity.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import static java.math.RoundingMode.CEILING;

public class Main{
    public static void main(String[] args)  {
// int [] arr=new int[10];//创建一个对象
// int [] arr2=new int[]{25,26,24};//直接进行赋值
            int [] arr2={25,26,24};//后续不能再次进行更改
//        int[][]arr3=new int [2][10];
//        arr3[0][2]=23;
        int [][] arr3={{1,3},{5,6},{9,10}};
        for (int[] ints : arr3) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
            System.out.println("!!!!!!!!!!!!!!!!!!!!!");
        }//进行二维元素的分组遍历
        System.out.println(arr3[0][1]);
        System.out.println("--------------------");
        arr2[0]=2;
        arr2[1]=5;
        System.out.println(arr2[0]);
        System.out.println(arr2.toString());
        for(int element:arr2){
            System.out.println(element);
        }//相当于直接进行遍历了


    }
}
