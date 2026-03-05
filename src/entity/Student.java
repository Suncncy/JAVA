package entity;

public class Student extends Person{
public Student(){
    super("小明",18,"男");//调用父类的构造方法啊
}
String name;

    public void study(){
        System.out.println("我是"+ super.name+"学习Java");
        hello();
    }

}
