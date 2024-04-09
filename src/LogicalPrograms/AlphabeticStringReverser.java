package src.LogicalPrograms;

//Write a program in Java for below condition:
//input string: di%^v&y@@a!
//output should be: ay%^v&i@@d!
public class AlphabeticStringReverser {

    public static void main(String[] args) {
        String input = "di%^v&y@@a!";
        String output = reverseString(input);
        System.out.println(output);
    }

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Skip non-alphabetic characters
            if (!Character.isLetter(chars[left])) {
                left++;
            } else if (!Character.isLetter(chars[right])) {
                right--;
            } else {
                // Swap alphabetic characters
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}


