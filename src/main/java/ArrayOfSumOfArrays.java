import java.util.Random;
import java.util.Scanner;

public class ArrayOfSumOfArrays {
    public static void main(String[] args) {
        System.out.print("Enter int value:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] table1 = fillArrayWithRandomInts(number);
        int[] table2 = fillArrayWithRandomInts(number);
        print(table1, number);
        System.out.println();
        print(table2, number);
        int[] table3 = sumOfArrays(table1, table2, number);
        System.out.println();
        print(table3, number);
    }

    private static int[] sumOfArrays(int[] table1, int[] table2, int arraySize) {
        int[] table = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            table[i] = table1[i] + table2[i];
        }
        return table;
    }


    private static int[] fillArrayWithRandomInts(int arraySize) {
        int[] table1 = new int[arraySize];
        Random rand = new Random();
        for (int i = 0; i < arraySize; i++) {
            table1[i] = rand.nextInt(99);
        }
        return table1;
    }

    private static void print(int[] table, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(table[i] + ", ");
        }
    }
}
