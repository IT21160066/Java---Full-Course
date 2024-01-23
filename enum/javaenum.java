
enum Status { // class
    Running, Failed, Pending, Success; // objects
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

        Status s = Status.Running;

        switch (s) {
            case Running:
                System.out.println("Running");
                break;

            default:
                System.out.println("Default");
                break;
        }

    }
}