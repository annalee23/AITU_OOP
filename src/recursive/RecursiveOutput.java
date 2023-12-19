package recursive;

public class RecursiveOutput{
    public static void printAscending(int start, int end) {
        if (start <= end) {
            System.out.print(start + " ");
            printAscending(start + 1, end);
        }
    }

    public static void printDescending(int start, int end) {
        if (start >= end) {
            System.out.print(start + " ");
            printDescending(start - 1, end);
        }
    }
}