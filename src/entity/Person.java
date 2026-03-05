package entity;

public class Person {
     String name;
     int age;
     String gender;
     public Person(String name){
         this.name=name;
     }
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void hello(){
    System.out.println("我叫"+name+"，今年"+age+"岁了");
}

}
