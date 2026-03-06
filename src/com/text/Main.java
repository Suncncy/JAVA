package com.text;

//import entity.Person;//进行导入设置，将person改成*号，就是相当于导入entity的所有类
import entity.Person;
import entity.Student;
import entity.Teacher;
public class Main{


    public static void main(String[] args){
        Person p1=new Person("小明",18,"男");
        Person p2=new Person("小明",18,"男");
        Person p3=new Person();
        Student s1=new Student();

//Student student=new Student();
//
//Person person=student;
//System.out.println(student.name);
//System.out.println(person.name);
//如果我们去取类中的变量，看的是编译时类型；如果我们去用类中的方法，看的是运行的类型
        p3.test();//父类用父类的静态方法
        s1.test();//子类用子类的静态方法；二者互不影响
System.out.println(p2==p1);
System.out.println(p2.equals(p1));
    }
}