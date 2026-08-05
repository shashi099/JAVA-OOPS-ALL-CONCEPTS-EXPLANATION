

public class Main{
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r = obj.add(1,10);
        System.out.println(r);
    }
}


class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
}

class AdvCalc extends Calc{
    public int add(int n1, int n2){   // child class over ride the method of parent calss
        return n1+n2+1;
    }
}
