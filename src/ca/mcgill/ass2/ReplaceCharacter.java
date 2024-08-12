package ca.mcgill.ass2;


    public class ReplaceCharacter {

        public static String replaceAll(String input, char oldChar, char newChar) {
            // Create a StringBuilder to build the new string
            StringBuilder result = new StringBuilder();

            // Iterate through each character in the input string
            for (char c : input.toCharArray()) {
                // If the current character is oldChar, append newChar
                // Otherwise, append the current character
                if (c == oldChar) {
                    result.append(newChar); // Append the replacement character
                } else {
                    result.append(c); // Append the current character
                }
            }

            // Convert StringBuilder to String and return it
            return result.toString();
        }

        public static void main(String[] args) {
            // Test cases
            String result1 = replaceAll("reza", 'd', 's');
            System.out.println(result1);

        }
    }


