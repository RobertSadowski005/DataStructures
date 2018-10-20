import java.util.Scanner;

public class ArrayFibo {
    public static void main(String[] args) {
        System.out.println("Enter int value:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        long[] table = fillArraywithFibonacci(number);
        print(table,number);
    }

    private static long[] fillArraywithFibonacci(int n) {
        long[] table = new long[n];
        table[0] = 1;
        table[1] = 1;
        for (int i = 2; i < n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }
        return table;
    }

    private static void print(long[] table, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(table[i] + ", ");
        }
    }
}
