package src.LogicalPrograms;


//Write a program in Java for below condition (Without using reverse method):
//input = this is String
//output = siht si gnirtS
public class WordReverser2 {

    public static void main(String[] args) {
        String input = "this is String";
        String output = reverseWords(input);
        System.out.println(output);
    }

    public static String reverseWords(String input) {
        StringBuilder reversed = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();
        char[] charactersInInput = input.toCharArray();

        for (char c : charactersInInput) {
            if (c != ' ') {
                currentWord.insert(0, c); // Prepend character to current word
            } else {
                reversed.append(currentWord).append(' '); // Append reversed word
                currentWord.setLength(0); // Clear current word
            }
        }

        // Append the last word
        reversed.append(currentWord);

        return reversed.toString();
    }

}



