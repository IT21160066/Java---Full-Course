
// import casting.A;
// import casting.B;
// import finalKey.FinalKey;
// import wrapper.Car;
// import wrapper.WagonR;
// import inner.AbstractAnonymus;
// import inner.AnonymusInner;
// import inner.inner;
// import javaInterface.Computer;
// import javaInterface.Demo;
// import javaInterface.Desktop;
// import javaInterface.Laptop;
import javaInterface.A;
import javaInterface.B;
import javaInterface.C;

public class MainFinal {

    public static void main(String args[]) {

        // FinalKey f = new FinalKey();
        // f.show();
        // f.add(5, 7);

        // A obj = (A) new B(); // upcasting
        // obj.showA();

        // B obj1 = (B) obj; // downcasting
        // obj1.showB();

        // int num = 7;
        // Integer num1 = num; // auto-boxing - taking primitive value and store in
        // aprmtive object
        // // converted to a object automatically
        // System.out.println(num1);

        // int num2 = num1.intValue(); // auto-unboxing - object type to primitive type
        // System.out.println(num2);

        // String str = "12";
        // int num3 = Integer.parseInt(str);
        // System.out.println(num3);

        // cannot create object of abstract class
        // Car obj = new WagonR();
        // obj.drive();
        // obj.playMusic();

        // inner in = new inner();
        // in.show();

        // inner.inside obj = in.new inside();
        // obj.config();

        // inner.inside obj1 = new inner.inside();
        // obj1.config();

        // AnonymusInner obj1 = new AnonymusInner() {
        // public void show() {
        // System.out.println("new show");
        // }
        // };
        // obj1.show();

        // AbstractAnonymus obj = new AbstractAnonymus() {
        // public void show() {
        // System.out.println("new show");
        // }
        // };

        // obj.show();

        // Computer lap = new Laptop();
        // Computer dp = new Desktop();

        // Demo obj = new Demo();
        // obj.devApp(lap);

        A obj;
        obj = new B();
        obj.show();
        obj.config();

        C obj1 = new B();
        obj1.calc();

        System.out.println(A.area);

    }
}
