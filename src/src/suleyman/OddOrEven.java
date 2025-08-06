package src.suleyman;

public class OddOrEven {
    public static void main(String[] args) {
        int number=7;
        oddOrEvenMethod(number);
        oddOrEvenMethod(-7);
        oddOrEvenMethod(8);
        oddOrEvenMethod(0);
        oddOrEvenMethod(-8);


    }


    public static void oddOrEvenMethod(int num){
        if(num%2==0){
            System.out.println(num+ " is an even number.");
        }else {
            System.out.println(num + " is an odd number.");
        }
    }
}
