package problemSolving;

public class Ventures {
    /*Write a program using loop to print the letters of the word "VENTURES" with two letters in
    one line.*/

    public static void main(String[] args) {
        String valueName = "VENTURES";
        System.out.println(displayVentures(valueName));
    }

    public static StringBuilder displayVentures(String word){
        int count = 1;
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            newString.append(word.charAt(i));
            if(count % 2 == 0){
                newString.append("\n");
            }
            count++;
        }
        return newString;
    }
}
