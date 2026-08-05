package constructor;

class Main{
    public static void main(String[] args) {
        new Human();
        Human obj = new Human(21, "Shashi");
        obj.show();
    }
}
 
class Human{
    private int age;
    private String name;

    Human(){
        System.out.println("Default Constructor");
    }

    // parametetized constructor
    Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void show(){
        System.out.println(getName() + " : " + getAge());
    }
}
