package src.suroj;

public class Finra {
    public static void main(String[] args) {
String result;

        for (int number = 1; number <= 30; number++) {

            boolean r1 = number % 3 == 0 & number % 5 == 0;
            boolean r2 = number % 3 == 0;
            boolean r3 = number % 5 == 0;

            if (r1) {
                result = "FINRA";
            } else if (r2) {
                result = "FIN";
            } else if (r3) {
                result = "RA";
            } else {
                result = "" + number;
            }
            System.out.print(result + " ");
        }
    }
}
