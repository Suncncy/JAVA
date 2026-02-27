public class Persion {
    String name;
    int age;
    String gender;
void hello(){
    System.out.println("我叫"+name+"今年"+age+"岁了");
    }
int sum(int a,int b) {
    int c=a+b;
    return c;//在if-else语句中也要用return返回
    }
void swap(int c,int d){
    int temp=c;
    c=d;
    d=temp;
    }
void modify(Persion persion){
    persion.name="hhhh";
    }
void setName(String name){
    this.name=name;//this指向对象的值
}
}
