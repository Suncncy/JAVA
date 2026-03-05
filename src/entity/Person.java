package entity;

public class Person {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.contains("小")){
            return ;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    private static Person instance;
    private Person(){
    }//加入这一行相当于把上面的pulic的Person代替掉了
    public static Person getInstance(){
       if(instance==null){
           instance=new Person();
       }
       return instance;
    }
}
