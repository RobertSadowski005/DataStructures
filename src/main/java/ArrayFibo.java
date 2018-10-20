import java.util.Scanner;

public class ArrayFibo {
    public static void main(String[] args) {
        System.out.println("Enter int value:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] table = fillArraywithFibonacci(number);

    }

    private static int[] fillArraywithFibonacci(int n){
        int[] table = new int[n];
        table[0]=1;
        table[1]=1;
        for (int i = 2; i <n ; i++){
            table[i]= table[i-1] + table[i-2];
        }
        return table;
    }




    private static long fibonacciNumberResault(long number) {
        if (number <= 1) return number;
        else return fibonacciNumberResault(number - 1) + fibonacciNumberResault(number - 2);
    }
}
