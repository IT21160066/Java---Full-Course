class A extends Object {

    public A() {
        super();
        System.out.println("Constructor A");
    }

    public A(int n) {
        super();
        System.out.println("Constructor A in n");
    }
}

class B extends A {

    public B() {
        // super(5);
        super();
        System.out.println("Constructor B");
    }

    public B(int n) {
        // super(n);
        this();
        System.out.println("Constructor B in n");
    }
}

public class This {

    public static void main(String args[]) {

        B b1 = new B(5);
    }

}
