public class OtherEx{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();    // in side class A

        obj = new B();
        obj.show();    // refrence variable obj represent the object of B


        obj = new C();
        obj.show();   //  refrence variable obj represent the object of C

    }
}

// Method Overriding

class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A {
      public void show(){
        System.out.println("In B show");
    }  
}

class C extends A{
    public void show(){
        System.out.println("In C show");
    }
}