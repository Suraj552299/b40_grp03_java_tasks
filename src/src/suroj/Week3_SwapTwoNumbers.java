package src.suroj;

public class Week3_SwapTwoNumbers {
    public static void main(String[] args) {
        swap_Method(11,10,'+');
        swap_Method(11,10,'/');


    }

    public static void swap_Method(int a, int b, char x){
        System.out.println("Before swapping b= "+ b);
        System.out.println("Before swapping a= "+ a);

        switch (x){
            case '+':
                a=a+b;//21
                b=a-b;//10
                a=a-b;//11
                System.out.println("After swapping b= "+ b);
                System.out.println("After swapping a="+ a);
                break;
            case '*':
                a=a*b;//21
                b=a/b;//10
                a=a/b;//11
                System.out.println("After swapping b= "+ b);
                System.out.println("After swapping a="+ a);
                break;
            default:
                System.out.println("İnvalid operation = " +x);
        }

    }

    /*
    Swap two variable values without using a third variable
     */

        // Aliya is volunteer


    }

