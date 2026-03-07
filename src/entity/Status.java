package entity;
//学生的状态
public enum Status {
    SLEEP("睡觉"),RUNNING("跑步"),STUDY("学习");
    String name;
    Status(String name){
        this.name=name;
    }//将枚举的英文改成中文的方法

    public String getName() {
        return name;
    }
}
