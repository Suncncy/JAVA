package entity;

public class Student extends Person{
    public String name="学生";
//public Student(){
//    super("小明",18,"男");//调用父类的构造方法啊
//}
    public Student(){}
    public void study(){
        System.out.println("我是"+ super.name+"学习Java");
    }
    public static void test(){
        System.out.println("我是子类的静态方法");
    }
public void hello(){//和父类的方法一样,调用将会用子类的
    System.out.println("我是学生，我叫"+name+"，今年"+age+"岁了");
}
}
