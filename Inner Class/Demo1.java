// Anonymous inner class can be used to achieve abstract class


public class Demo1 {
    public static void main(String[] args) {
        Animal c = new Animal(){       // Inner Class instead of creating another class we can use Annonymous Inner Class
            public void Sound(){
               System.out.println("Can Speak..");
            }
        };
        c.Sound();
    }
}

abstract class Animal{
    public abstract void Sound();
}

// class Cow extends Animal{
//     public void Sound(){
//         System.out.println("Can Speak..");
//     }
// }
