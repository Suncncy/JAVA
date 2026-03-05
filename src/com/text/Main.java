package com.text;

//import entity.Person;//进行导入设置，将person改成*号，就是相当于导入entity的所有类
import entity.Person;
import entity.Student;
import entity.Teacher;
public class Main{
    public static void main(String[] args){
Student student=new Student();
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
if(p instanceof Student){
    Student s=(Student)p;
s.study();
}else if(p instanceof Teacher){
    Teacher t=(Teacher)p;
    t.teach();
}
    }
}