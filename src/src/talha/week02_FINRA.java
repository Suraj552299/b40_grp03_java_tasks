package src.talha;

public class week02_FINRA {
    public static void main(String[] args) {

        finra(30);
        finra(50);
    }

    public static void finra(int num){
        if (num % 3 == 0){
            System.out.print("FIN ");
        } else if (num % 5 == 0) {
            System.out.print("RA ");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.print("FINRA ");
        } else {
            System.out.print(num + " ");
        }

    }
}
