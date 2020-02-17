import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        int[] list = new int[0];
        int input;
        System.out.println("Bitte gib die zu sortierenden Zahlen ein:");
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNext("q") && !scanner.hasNext("Q")){

            input = scanner.nextInt();
            int[] temp = new int[list.length + 1];
            for (int i = 0; i < list.length; i++) {
                temp[i] = list[i];
            }
            temp[list.length] = input;
            list = temp;

        }
        int highest = list[0];

        for (int i = 1; i < list.length; i++) {
            if (list[i] > highest) {
                highest = list[i];
            }
        }
        System.out.println("Die höchste Zahl ist " + highest);
    }
}
