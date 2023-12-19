package recursive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            RecursiveOutput.printAscending(a, b);
        } else {
            RecursiveOutput.printDescending(a, b);
        }

        scanner.close();
    }
}
