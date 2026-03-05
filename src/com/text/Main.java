package com.text;

import entity.Person;//进行导入设置，将persion改成*号，就是相当于导入entity的所有类

public class Main{
    public static void main(String[] args){
//Person p=new Person();
//p.setName("大明");
//System.out.println(p.getName());
Person p1=Person.getInstance();

    }
}