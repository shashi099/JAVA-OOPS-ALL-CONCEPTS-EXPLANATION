// Functional Interface  or     SAM(single abstract method)

public class Demo2 {
    public static void main(String[] args) {
        Wallet obj = new Wallet(){
            public void myMoney(){
                System.out.println("5000 hai!");
            }
            public int calMoney(int coin){
                return coin + 5000;
            }
        };
        obj.myMoney();
        obj.calMoney(1000);
    }
}

interface Wallet{
    void myMoney();
    int calMoney(int coin);
}
