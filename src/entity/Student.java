package entity;

public class Student extends Person implements Study,Cloneable{


    public void study(){
        System.out.println("我是"+ super.name+"学习Java");
    }

public void hello(){//和父类的方法一样,调用将会用子类的
    System.out.println("我是学生，我叫"+name+"，今年"+age+"岁了");
}

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
