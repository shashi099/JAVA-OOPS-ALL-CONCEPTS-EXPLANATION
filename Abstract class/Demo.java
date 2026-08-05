
class Demo{
    public static void main(String[] args) {

        Computer lap = new Laptop();   // 
        Computer desk = new Desktop();

        Developer shashi = new Developer();
        shashi.devApp(lap);  // coding ke liye laptop / desktop jo v hai company ke pass wo developer ko de skti hai        

    }
}

// company hire ki hai developer  -> coding ke liye laptop / desktop kuch to dena hoga
class Developer{
    public void devApp(Computer comp){    // laptop / desktop to computer hi hota hai
        comp.code();
    }
}

abstract class Computer{      // Computer can be anything Phone / Laptop / Desktop 
    public abstract void code();   // asbtract method kyuki code to laptop or desktop me hota hai
}

class Laptop extends Computer{
    public void code(){
        System.out.println("Coding via Laptop");
    }
}

class Desktop extends Computer{
    public void code(){
        System.out.println("Coding via Desktop");
    }
}
