package src.suroj;

public class Task2 {

        // Write function that can find the frequency of characters
        // Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2


        public static String frequencyOfChars(String str) {
            StringBuilder result = new StringBuilder();
            String checked = "";

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);

                // Skip if already counted
                if (checked.contains("" + currentChar)) {
                    continue;
                }

                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == currentChar) {
                        count++;
                    }
                }

                result.append(currentChar).append(count);
                checked += currentChar;
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String input = "AAABBCDD";
            String output = frequencyOfChars(input);
            System.out.println(output);  // Output: A3B2C1D2
        }

    }









