package src.LogicalPrograms;

//Write a program in Java for below condition:
//input = this is String
//output = siht si gnirtS
public class WordReverser {

    public static void main(String[] args) {
        String input = "this is String";
        String output = reverseWords(input);
        System.out.println(output);
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversed.append(reversedWord.reverse()).append(" ");
        }

         //Remove trailing space for last word
        if (reversed.length() > 0) {
            reversed.setLength(reversed.length() - 1);
        }

        return reversed.toString();
    }
}


