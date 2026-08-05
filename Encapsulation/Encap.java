package Encapsulation;

public class Encap {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setName("Shashi");
        obj.setAge(24);

        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

class Human{
    private int age;
    private String name;

    public void setAge(int age){
        this.age = age;              // <--- this: Basically refers or point to the current object
    }

    public int getAge(){
        return age;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

}
