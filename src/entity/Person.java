package entity;

import java.util.Objects;

public abstract class Person{//默认继承object类
     protected String name;
     protected int age;
     protected String gender;

    public abstract void hello();//抽象方法只能抽象类中进行实现
}
