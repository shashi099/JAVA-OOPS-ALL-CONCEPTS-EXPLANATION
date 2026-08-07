public class Demo2 {
    public static void main(String[] args) {

        Laptop[] lap = Laptop.values();  // All the objects of Laptop

        for(Laptop l : lap)
        {
            System.out.println(l + " : " + l.getPrice());
        }
    }   
}


enum Laptop{
    Macbook(2000), Dell, Microsoft(1000), Thinkpad(900), Lenovo(500);

    private int price;

    private Laptop(int price) {          // private constructor because the object with in the same enum
        this.price = price;
    }

    private Laptop() {  // Default Constructor
        price = 650;    // It will assign the value 650 of all the DEFAULT OBJECT 
    } 

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
