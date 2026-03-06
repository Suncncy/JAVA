package com.text;

//import entity.Person;//进行导入设置，将person改成*号，就是相当于导入entity的所有类
import entity.Person;
import entity.Student;
import entity.Study;
import entity.Teacher;
public class Main{
    public static void main(String[] args) throws CloneNotSupportedException {
//      Person p=new Person();//抽象类不能被实例化
//        Study p=new Student();//进行接口类的创建
//        p.study();
//        if(p instanceof Student student){
//            student.hello();
//        }
        Student p=new Student();
        Object clone=p.clone();
        System.out.println(clone);

    }
}