package src.LogicalPrograms;


//Write a program in Java for below condition:
//Sample Input string: "This is a sample input string"
//Output should be : "This1 is1 a1 sample1 input1 string1"
public class WordNumberAppender {
    public static void main(String[] args) {
        String input = "This is a sample input string";
        String output = addIndexes(input);
        System.out.println(output);
    }

    public static String addIndexes(String input) {
        String[] words = input.split(" "); //split by space
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            output.append(words[i]); //adding word in output string
            output.append(1); // appending the number
            if (i != words.length - 1) {
                output.append(" ");
            }
        }

        return output.toString();
    }
}


