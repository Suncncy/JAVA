package entity;

public class Teacher extends Person {//在public后面加上final就是相当于这一类不允许再被往下面分割
    public Teacher(){
        super("小明",18,"男");//调用父类的构造方法啊
    }
    public void teach(){
        System.out.println("我教Java");
    }
}
