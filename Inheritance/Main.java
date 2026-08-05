 
public class Main {
    public static void main(String[] args) {
        SuperCalc obj = new SuperCalc();
        int r1 = obj.add(12,12);
        int r2 = obj.sub(12,2);
         
        int r3 = obj.mul(12,5);
        int r4 = obj.div(15,4);
        double r5 = obj.power(4,2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 +" " + r5);

 
    }
}
