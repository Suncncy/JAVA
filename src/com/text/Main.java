package com.text;

//import entity.Person;//进行导入设置，将person改成*号，就是相当于导入entity的所有类
import entity.Person;
import entity.Student;
import entity.Study;
import entity.Teacher;
public class Main{
    public static void main(String[] args)  {
 Study s=new Student();
  s.study();
  Study t=new Teacher();
  t.study();//进行了默认实现


    }
}