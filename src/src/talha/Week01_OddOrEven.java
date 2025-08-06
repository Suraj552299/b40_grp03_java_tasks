package src.talha;

public class Week01_OddOrEven {
    public static void main(String[] args) {

        int num = 8;
        oddOrEvenMethod(9);
        oddOrEvenMethod(57);
        oddOrEvenMethod(75);
        oddOrEvenMethod(40);

    }

    public static void oddOrEvenMethod(int num){

        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}
