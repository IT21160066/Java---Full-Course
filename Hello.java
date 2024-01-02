class Hello {
    public static void main(String args[]) {

        // data types

        // int num1 = 3;
        // int num2 = 5;
        // int result = num1 + num2;

        // double marks = 6.5;
        // float num = 5.6f;
        // byte by = 127;
        // long l = 5854l;
        // System.out.println(result);

        // System.out.println("hello");

        // literals

        // int num1 = 0b101;
        // System.out.println(num1);

        // int num2 = 0x7E;
        // System.out.println(num2);

        // int num3 = 10_000_000;
        // System.out.println(num3);

        // double num4 = 12e10;
        // System.out.println(num4);

        // char c = 'a';
        // c++;
        // System.out.println(c);

        // byte b = 127;
        // int a = b;
        // System.out.println(a);

        // int a = 257;
        // byte k = (byte) a;

        // float m = 5.6f;
        // int t = (int) m;

        // System.out.println(t);

        // type promotion

        // byte a = 10;
        // byte b = 20;

        // int result = a * b;
        // System.out.println(result);

        // asignment opertors

        // int num1 = 7;
        // int num2 = 5;
        // int result = num1 % num2;

        // num1 = num1 + 2;
        // num1 *= 2;
        // num1++;
        // ++num1;

        // int result = ++num1; //increment and then fecth the value
        // int result = num1++; // fetch the value and then increment

        // System.out.println(result);

        // double x = 8.8;
        // int y = 6;

        // int a = 8;
        // int b = 6;

        // boolean result = x != y && a > b;
        // System.out.println(result);

        // int x = 7;
        // int y = 5;

        // int a = 5;
        // int b = 9;

        // boolean result = x < y || a < b;
        // System.out.println(!result);

        // int x = 2;
        // int y = 7;
        // int z = 5;

        // if(y  > x)
        //     System.out.println("Hello");
        // else if(x > z)
        //     System.out.println("Wow");
        // else
        //     System.out.println("Bye");

        // int number = 4;
        // int result = 0 ;

        // result = number % 2 == 0 ? 10 : 20;
        // System.out.println(result);

        int number = 6;
        switch (number) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("default");
                break;
        }
        
    }
}