package util;

import java.util.Scanner;

public class InputUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static String input(String info) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

}
