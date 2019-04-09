import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("Please enter a number between -999,999 and 999,999");

            if (!in.hasNextInt()) {
                System.out.println("Your input must be an integer between -999,999 and 999,999");
                in.nextLine();
                continue;
            }

            int userInput = in.nextInt();

            if (userInput > 999999 || userInput < -999999) {
                System.out.println("The Integer must be between 999,999 and -999,999");
                in.nextLine();
                continue;
            }

            System.out.println(NumberConverter.convert(userInput));

            break;
        }

    }
}
