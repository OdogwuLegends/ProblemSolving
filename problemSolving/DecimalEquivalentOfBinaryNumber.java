package problemSolving;

import java.util.ArrayList;
import java.util.List;

public class DecimalEquivalentOfBinaryNumber {
    public static void main(String[] args) {
        int number = 1101;
        System.out.println(binaryNumber(number));
    }

    public static int binaryNumber(int number){
        int divisor = 1;
        int count = 1;
        int newAnswer = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < Math.log10(number)+1; i++) {
            int digit = (number / divisor) % 10;
            int newDigit = digit * count;
            list.add(newDigit);
            divisor *= 10;
            count *= 2;
        }
        for (int i = 0; i < list.size(); i++) {
            newAnswer += list.get(i);
        }
        return newAnswer;
    }
}
