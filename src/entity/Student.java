package entity;

public final class Student extends Person implements Study{
 private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void study(){
        System.out.println("我是"+ super.name+"学习Java");
    }

public void hello(){//和父类的方法一样,调用将会用子类的
    System.out.println("我是学生，我叫"+name+"，今年"+age+"岁了");
}

}
