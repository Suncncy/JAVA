public class Main{
    public static void main(String[] args){
Persion p=new Persion("小红",20,"女");
Persion p2=new Persion();
Persion p3=new Persion();
p.hello();
p2.hello();
//p3.info="Hello world";//给静态变量赋值
        Persion.info=("直接赋值");//直接给静态变量赋值
//System.out.println(p3.info);
System.out.println(Persion.info);
Persion.test();//打印静态函数里面的内容
    }
}