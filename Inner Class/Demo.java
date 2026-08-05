

class Demo{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        // create obj of Inner class
        
        // A.B obj1 = new A.B();    possible only when Inner class is static
        A.B obj1 = obj.new B();
        obj1.show();

    }

}

class A{
    int marks;

    public void show(){
        System.out.println("Inside A class show");
    }

    class B{    // Inner class
        public void show(){
            System.out.println("Inside Inner class show");
        }
    }

}