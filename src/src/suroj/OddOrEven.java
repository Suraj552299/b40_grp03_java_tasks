package src.suroj;

public class OddOrEven {
    public static void main(String[] args) {
        int number=6;
        String result;

        if (number%2==0){
            result = number+" is Even";
        }else{
            result = number+" is Odd";
        }
        System.out.println(result);
    }
}
