package com.text;

import entity.Person;//进行导入设置，将persion改成*号，就是相当于导入entity的所有类

public class Main{
    public static void main(String[] args){
System.out.println("Hello world!");
Person p2=new Person();
Person p3=new Person();//public是当前类，同一个包下的类，不同包下的子类，不同包下的类都能访问
        //protected是不同包下的类不能访问；
        //默认是不同包下的子类，和不同包下的类不能访问；
        //privata是只能访问当前类
    }
}