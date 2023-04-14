package problemSolving;

public class ValueOfPI {
    public static void main(String[] args) {
        System.out.println(nValueOfPI());

    }
    public static double nValueOfPI(){
        double newAnswer = 0.0;
        double denominator = 1;


        for (int i = 1; i <= 136127; i++) {
            if (i % 2 == 0) {
                newAnswer -= 4 / denominator;

            } else {
                newAnswer += 4 / denominator;
            }
            denominator += 2;
            System.out.println(i + "              " + newAnswer);
        }
        return newAnswer;
    }
}
