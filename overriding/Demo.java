package overriding;

class A {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public void config() {
        System.out.println("config");
    }
}

class B extends A {

    public int add(int n1, int n2) {
        return n1 + n2 + 5;
    }
}

public class Demo {

    public static void main(String args[]) {

        B obj = new B();
        obj.add(5, 4);
    }

}
