// Basically use for make constant value

class Demo{
    public static void main(String[] args) {
        A obj = new A();
        // obj.schoolName = "ABC Schoool";   Not possible to override the final varible
        System.out.println(obj.schoolName);

        B obj1 = new B();
        obj1.show();

    }

}

class A{
    final String schoolName = "XYZ School";

    // schoolName = "ABC School";    // Not possible to change the varible if it is final

    final public void show(){
        System.out.println("In side final method class A");
    }

}

class B extends A{ 

    // Not possible to override the method final

    // final public void show(){
    //     System.out.println("In side final method class B");
    // }
}