// Lambda Expression 
// it is possible only one method should be in Interface class

// Demo2.java file when ( main ) is calling by Inner Class 
// we can use LAMBDA EXPRESSION there


public class Demo3 {
    public static void main(String[] args) {
        // LAMBDA EXPRESSION ony if there is only one method in interface class
        Wallet obj = () -> System.out.println("5000 hai!");  
             
        obj.myMoney();
    }
}

interface Wallet{
    void myMoney();
}
