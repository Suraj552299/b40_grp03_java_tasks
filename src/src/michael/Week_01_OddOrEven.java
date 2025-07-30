package src.michael;

public class Week_01_OddOrEven {


    /*
    *  Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
* */

    public static void main(String[] args) {
int num=7;
if (num%2==0){
    System.out.println("Number is Even:" + num);
}else if (num%2==1){
    System.out.println("Number is Odd:" + num);
}

    }
}
