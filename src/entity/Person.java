package entity;

import java.util.Objects;

public sealed abstract class Person permits Student, Teacher {//默认继承object类
     protected String name;
     protected int age;
     protected String gender;

    public abstract void hello();//抽象方法只能抽象类中进行实现
}
