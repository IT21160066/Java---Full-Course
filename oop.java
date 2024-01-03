class Calculator{

    public int calculateValue(int num1, int num2){

        int result = num1 +  num2;
        return result;
    }
}

public class oop {

    public static void main(String args[]) {

        int n1 = 5;
        int n2 = 4;
        
        Calculator calc = new Calculator();
        int result = calc.calculateValue(n1, n2);
        System.out.println(result);
    }
    
}
