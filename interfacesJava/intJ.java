package interfacesJava;

@FunctionalInterface
interface A { // only have one method

    // void show(int x);

    int add(int i, int j);
}

// class B implements A{

// @Override
// public void show() {
// System.out.println("show");
// }

// }

// lambda expression only work with functional interfaces

public class intJ {

    public static void main(String[] args) {

        // A a = x -> System.out.println("show : " + x); // lambda expression

        // a.show(5);

        A obj = (i, j) -> i + j;
        int result = obj.add(5, 9);
        System.out.println(result);

    }

}
