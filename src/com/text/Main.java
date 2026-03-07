package com.text;

//import entity.Person;//进行导入设置，将person改成*号，就是相当于导入entity的所有类
import entity.*;

public class Main{
    public static void main(String[] args)  {
 Student student=new Student();
// student.setStatus("跑步");
//        student.setStatus(Status.RUNNING);
     student.setStatus(Status.valueOf("RUNNING"));//转换成枚举的类向
System.out.print(student.getStatus().getName());
    }
}