package src.suroj;

public class Week09_FindMaximum {

    public static void main(String[] args) {
        int[] numbers={1, 5, 8, 3, 2, 11, -1,456,8563};

        System.out.println(findMaxNumber(numbers));
    }

    /*
    Write a function that can find the maximum number from an int Array
    ** Please do not use any sort method...

    input = [1, 5, 8, 3, 2, 11, -1]
    output = 11

     */

    // Suroj is volunteer

    public static int findMaxNumber(int[] number) {
        int max;
        max = number[0];

        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }

        }
        return max;
    }


}
