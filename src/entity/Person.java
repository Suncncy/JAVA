package entity;

import java.util.Objects;

public class Person{//默认继承object类
     protected String name="人类";
     protected int age;
     protected String gender;
     public Person(String name){
         this.name=name;
     }
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
    }


    public void hello(){
    System.out.println("我叫"+name+"，今年"+age+"岁了");
}

//    @Override
//    public boolean equals(Object obj) {//将名字，年龄，性别进行比较
//       if(obj instanceof Person another){
//           return name.equals(another.name)
//                   &&age== another.age
//                    && gender.equals(another.gender);
//
//       }
//       return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(gender, person.gender);
    }
public static void test(){
         System.out.println("父类的静态方法");
}
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
