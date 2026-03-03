public class Persion {
    String name;
    int age;
    String gender;
    static String info;//定义了一个静态变量
    Persion(){};
    Persion(String name,int age){
        this(name,age,null);//利用下面这个完整的函数及逆行构造
    }
Persion(String name,int age,String gender){//这是个构造方法
    this.name=name;
    this.age=age;
    this.gender=gender;
    System.out.println("我是一个函数");
    name="小明";
    age=18;
}
void hello(){

    System.out.println("我是"+name+"年龄"+age+"性别"+gender);
}
 static void test(){//静态变量函数，直接和类挂钩，跟成员里面的属性没有一点关系，也和类里面的函数没有关系，可以获取静态变量
        System.out.println("Hello world");
}

}
