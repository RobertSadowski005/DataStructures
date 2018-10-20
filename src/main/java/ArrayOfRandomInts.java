import java.util.Random;
import java.util.Scanner;

public class ArrayOfRandomInts {
    public static void main(String[] args) {
        System.out.print("Enter int value:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] table = fillArrayWithRandomInts(number);
        print(table, number);
        System.out.println();
        System.out.print("Are numbers in array sorted?: ");
        System.out.print(checingIfNumbersInArrayAreSorted(table, number));
    }

    private static boolean checingIfNumbersInArrayAreSorted(int[] table, int number) {
        for (int i = 0; i < number-1; i++) {
            if (table[i]>table[i+1])
                return false;
        }
        return true;
    }

    private static int[] fillArrayWithRandomInts(int amountOfNumbers) {
        int[] table = new int[amountOfNumbers];
        Random rand = new Random();
        for (int i = 0; i < amountOfNumbers; i++) {
            table[i] = rand.nextInt(99);
        }
        return table;
    }

    private static void print(int[] table, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(table[i] + ", ");
        }
    }
}
