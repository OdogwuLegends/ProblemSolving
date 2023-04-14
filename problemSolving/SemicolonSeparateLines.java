package problemSolving;

public class SemicolonSeparateLines {
    /*Write a program to print the letters of the word "SEMICOLON" with each alphabet in a
    separate line*/

    public static void main(String[] args) {
        String valueName = "SEMICOLON";

        separateLines(valueName);

    }

    public static void separateLines(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}
