import java.util.Scanner;

public class Maximum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in your numbers: end with q");
        int[] numbers = new int[0];
        int[] moreNumbers;
        int highestNumber = 0;  // The program will not run, if there is a possibility a variable might not be initialized.
        // This can only happen here, if the user types no number or just one number. In this case the user is stupid and i will (at this moment)
        // not create an explaining message and a loop to continue the program.
        while (!scanner.hasNext("q")) {
            moreNumbers = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                moreNumbers[i] = numbers[i];
            }
            moreNumbers[moreNumbers.length - 1] = scanner.nextInt();
            if (moreNumbers.length == 1) {
                highestNumber = moreNumbers[0];
            } else if (moreNumbers[moreNumbers.length - 1] > highestNumber) {
                highestNumber = moreNumbers[moreNumbers.length - 1];
            }
            numbers = moreNumbers;
        }
        System.out.println(highestNumber);
    }
}