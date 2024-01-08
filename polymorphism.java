//runtime polymorphism
//overriding

class A {

    public void show() {
        System.out.println("A");
    }
}

class B extends A {

    public void show() {
        System.out.println("B");
    }
}

class C extends A {

    public void show() {
        System.out.println("C");
    }
}

public class polymorphism {

    public static void main(String args[]) {

        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

        // behaving differently with different objects
        // parent A variable have child objects B, C
        // decided at runtime
    }
}
