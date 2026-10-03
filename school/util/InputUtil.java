package school.util;

import java.util.Scanner;

public class InputUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static String readString(String message) {

        System.out.print(message);
        return scanner.nextLine().trim();
    }

    public static int readInt(String message) {

        while (true) {

            try {

                System.out.print(message);

                int value = Integer.parseInt(scanner.nextLine());

                return value;

            } catch (NumberFormatException e) {

                System.out.println(
                    "Invalid input. Please enter a number."
                );
            }
        }
    }

    public static int readPositiveInt(String message) {

        while (true) {

            int value = readInt(message);

            if (value > 0) {
                return value;
            }

            System.out.println(
                "Please enter a number greater than 0."
            );
        }
    }
}