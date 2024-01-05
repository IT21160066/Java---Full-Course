class Mobile{

    String brand;
    int price;
    static String name;

    static{
        name = "Phone";
        System.out.println("Static block");
    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("Constructor");
    }

    public void show(){
        System.out.println(brand+ " : " +price+ " : " +name);
    }

    public static void show1(Mobile mobile1){
        System.out.println("Static method");
        System.out.println(mobile1.brand+ " : " +name);
    }
}

public class Practice {
    
    public static void main(String args[]) throws ClassNotFoundException{

        // Mobile mobile1 = new Mobile();
        // mobile1.brand = "Apple";
        // mobile1.price = 1500;
        // Mobile.name = "Smart Phone";

        // Mobile mobile2 = new Mobile();
        // mobile2.brand = "Samsung";
        // mobile2.price = 1600;
        // Mobile.name = "Smart Phone";

        // mobile1.show();
        // mobile2.show();
        // Mobile.show1(mobile1);

        // Mobile mobile3 = new Mobile();

        Class.forName("Mobile");

    }
}
