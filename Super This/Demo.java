// Super()  <-- keyword


public class Demo{

    public static void main(String[] args) {
        B obj = new B();
    }

}

class B extends A{

    // Default Const
    public B(){ 
        super();     // it will call the default const of parent class 

//      super(5);  // it will call the parameter Const of Class A
        System.out.println("In B");  
    }

    // Parameterized Const
    public B(int num){
        // super();      // it will call the default const of parent class 

        super(num);  // it will call the parameter Const of Class A
        System.out.println("In B Parameterized");
    }

}

class A extends Object{    // By Default every Parent class extends from Object Class

    // Default Const
    public A(){
        System.out.println("In A");
    }

//  parameterized Const
    public A(int num){
        System.out.println("In A Parameterized Const");
    }

}


