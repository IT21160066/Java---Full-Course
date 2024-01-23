
enum Status { // class
    Running, Failed, Pending, Success; // objects
}

enum Laptop {
    Hp(200), Acer(500), Asus, Dell(1000);

    private int price;

    private Laptop() {
        this(500);
        this.price = 600;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class javaenum {

    public static void main(String[] args) {

        // Status s = Status.Running;
        // System.out.println(s);
        // System.out.println(s.ordinal());

        // Status[] ss = Status.values();

        // for (Status x : ss) {
        // System.out.println(x + " : " + x.ordinal());
        // }

        // Status s = Status.Running;

        // switch (s) {
        // case Running:
        // System.out.println("Running");
        // break;

        // default:
        // System.out.println("Default");
        // break;
        // }

        // Laptop lap = Laptop.Acer;
        // System.out.println(lap);
        // System.out.println(lap.getPrice());

        for (Laptop x : Laptop.values()) {
            System.out.println(x + " : " + x.getPrice());
        }

    }
}