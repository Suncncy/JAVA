public class Persion {
    String name;
    int age;
    String gender;
int sum(int a,int b){
    return a+b;
}
double sum(double a,double b){//和
    return a+b;
}
//-----------------------------------------------
void hello(){
    System.out.println("你好");
}
void goodbye(){
        System.out.println("再见");
    }
    void play(){
        System.out.println("玩耍");
    }
    void test() {
        hello();
        goodbye();
        play();
    }//函数的互相调用
    int test1(int n){
    if(n==0) return 0;
    return test1(n-1)+n;
    }//函数的递归
//--------------------------------
}
