class Calculator{

    public int calculateValue(int num1, int num2, int num3){

        return num1 +  num2 + num3;
    }
    public int calculateValue(int num1, int num2){

        return num1 +  num2;
    }
}

public class oop {

    public static void main(String args[]) {

        int n1 = 5;
        int n2 = 4;
        int n3 = 6;
        
        Calculator calc = new Calculator();

        int result = calc.calculateValue(n1, n2, n3);
        System.out.println(result);

        int value = calc.calculateValue(n1, n2);
        System.out.println(value);
    }
    
}

// class Computer{
    
//     public void playMusic(){
//         System.out.println("music");
//     }

//     public String getMeAPen(int cost){

//         if(cost >= 10)
//             return "Pen";
//         else
//             return "Invalid";
//     }
// }

// public class oop {

//     public static void main(String args[]) {

//         Computer computer = new Computer();
//         computer.playMusic();
//         String valueOfpen = computer.getMeAPen(25);
//         System.out.println(valueOfpen);
//     }
// }