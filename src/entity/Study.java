package entity;

public sealed interface Study permits Student, Teacher {//接口与接口之间可以实现继承
  int a=10;//只能是public，final和static类型的
  static void test(){

  }//只能是静态的函数,供内部使用
    default void study(){
      System.out.println("我是默认实现");
    }//加default意思是，默认实现
  private void inner(){
    System.out.println("我是一系列内部操作");
  }//只能是private
}