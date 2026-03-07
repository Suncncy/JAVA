package entity;

public record Order(int id,String product ,String address) {
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}//纪录类，用于保存一些不可变的数据类,全参构造,不能自己进行继承
