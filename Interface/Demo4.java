// LAMBDA EXPRESSION Achieved here

public class Demo4 {
    public static void main(String[] args) {
        Calc obj = (int n1, int n2) -> n1+n2;
        int result = obj.add(10,20); 
        
        System.out.println(result);
    }
}

@FunctionalInterface
interface Calc{
    int add(int a, int b);
}