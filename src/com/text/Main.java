package com.text;

//import entity.Person;//进行导入设置，将person改成*号，就是相当于导入entity的所有类
import entity.Person;
import entity.Student;
import entity.Teacher;
public class Main{
    public static void main(String[] args){
Student student=new Student();
Student student1=student;
System.out.println(student.toString());//包名+名称+16进制的存放的内存地址
System.out.println(student.equals(student1));//equals进行判断两个对象是否相等

test(student);
//student.hello();
//student.study();
//Teacher teacher=new Teacher();
//teacher.teach();
//teacher.hello();
//Person p=new Student();//将子类换成父类
//Student s=(Student) p;//再将p强制转换成子类

    }
    private static void test(Person p){
if(p instanceof Student student){
//    Student s=(Student)p;//将父类的person转换成子类的
student.study();
}else if(p instanceof Teacher){
    Teacher t=(Teacher)p;
    t.teach();
}
    }
}