// Normal Interface

class Demo{
    public static void main(String[] args) {
        C obj = new C();
        obj.myMethod();
    }
}

interface A{
    void myMethod();
}

interface B{
    void myMethod();
}

class C implements A,B{
    public void myMethod(){
        System.out.println("By Interface Here Implement Multiple Inheritance");
    }
}