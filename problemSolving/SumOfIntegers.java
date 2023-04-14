package problemSolving;

public class SumOfIntegers {
    /*
    Write an application that calculates the sum of those integers between 1 and 30 that are
divisible by 3.
     */

    public static void main(String[] args) {
        int number = 30;
        System.out.println(sumOfIntegersDivisibleByThree(number));
    }

    public static int sumOfIntegersDivisibleByThree(int number){
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if(i % 3 == 0){
                sum += i;
            }
        }
        return sum;
    }
}
