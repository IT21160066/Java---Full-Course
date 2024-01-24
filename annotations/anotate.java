package annotations;

class A {

    public void display() {
        System.out.println("A show");
    }
}

class B extends A {

    @Override
    public void display() {
        System.out.println("B show");
    }
}

public class anotate {

    public static void main(String[] args) {

        B obj = new B();
        obj.display();
    }

}
