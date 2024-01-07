public class inheritance {

    public static void main(String args[]) {

        HighAdvanceCal cal1 = new HighAdvanceCal();

        int op1 = cal1.add(5, 6);
        cal1.sub(5, 6);
        cal1.multi(5, 6);
        cal1.div(5, 6);
        cal1.power(3, 2);

        System.out.println(op1);

    }
}
