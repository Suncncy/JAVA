public class Main{
    public static void main(String[] args){
        //这是代码的模板，三条杠则是markdown格式
     System.out.println("Hello world!");
     System.out.println("YYds");
      final int a=10;//final将a变成了常量类型，a的值就不能进行更改了
        Persion p1=new Persion();
        Persion p2=null;//努力了是一个特殊的值，他表示空，就是不引用任何的对象
        Persion p3=new Persion();
        p1.name="Suncncy";
        p1.age=18;
        p1.hello();//进行函数的调用，运行
         int result=p1.sum(10,20);//有返回值的调用
         System.out.println(result);
         int c=20,d=30;
        p1.swap(c,d);//只是把值复制进去了。并不会导致原来的值进行改变
         System.out.println("c="+c+"d="+d);
         p1.modify(p1);
         System.out.println(p1.name);
         p1.setName("suncncy2");
        System.out.println(p1.name);
        System.out.println(a);
        System.out.println(p3.age);//如果不赋值，那么打出来就是0；name和gender打出来是null
    }

}