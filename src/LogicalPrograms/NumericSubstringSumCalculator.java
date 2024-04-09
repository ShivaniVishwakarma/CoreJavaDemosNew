package src.LogicalPrograms;


//Write a program in Java for below condition:
//input string= A20B30C40
//output should be: 90
public class NumericSubstringSumCalculator {
    public static void main(String[] args) {
        String input = "A20B30C40";
        int output = calculateNumericSubstringSum(input);
        System.out.println(output);
    }

    public static int calculateNumericSubstringSum(String input) {
        int sum = 0;
        StringBuilder numStr = new StringBuilder();
        char[] characters = input.toCharArray();

        for (char c : characters) {
            if (Character.isDigit(c)) {
                numStr.append(c);
            } else {
                if (numStr.length() > 0) {
                    sum += Integer.parseInt(numStr.toString());
                    numStr.setLength(0); // Reset the StringBuilder
                }
            }
        }

        // Add the last numeric substring if it exists
        if (numStr.length() > 0) {
            sum += Integer.parseInt(numStr.toString());
        }

        return sum;
    }
}


