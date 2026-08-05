public class Demo1 {
    public static void main(String[] args) {
        A obj = new A();
    }
}

class B{
    public B(){
        System.out.println("inside default constructor B");
    }
}

class A extends B{

    public A(){
        // super(); // call parent class default const

        this(5);  // call the same level class (A) parameterized constructor
        System.out.println("inside default constructor A");
    }

    public A(int num){
        System.out.println("inside parameterized constructor: A");
    }
}