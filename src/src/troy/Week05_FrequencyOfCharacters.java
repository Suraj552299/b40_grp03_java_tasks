package src.troy;

public class Week05_FrequencyOfCharacters {

    /*
         Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

     */

    public static String frequencyOfChars1(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {//cccdddEEEFFF
            int count = 0;
            for (int i = 0; i < str.length(); i++) {//aaabbbcccdddEEEFFFaaabcdeaa
                if (str.charAt(i) == str.charAt(j)) {
                    count++;//3
                }
            }
            expectedResult += str.charAt(j) + "" + count;//a3b3c3E3F3
            str = str.replace("" + str.charAt(j), "");

            System.out.println(str);// to see how counted letters is being removed from the String

        }
        return expectedResult;

    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChars1("aaabbbcccdddEEEFFFaaabcdeaa"));
    }




}
