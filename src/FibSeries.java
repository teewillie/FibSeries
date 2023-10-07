/**
 * @class: FibSeries
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 6, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 *
 * Description:
 */

public class FibSeries {
    public static void main(String[] args) {
        int n = 30; // The number of Fibonacci values to print
        long[] fibonacciSeries = new long[n];

        // Initialize the first two values in the series
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        int i = 2; // Start with the third value in the series

        // Calculate and store the rest of the values in the series using a while loop
        while (i < n) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
            i++;
        }

        // Print the first 30 values in the Fibonacci series
        System.out.println("First 30 values in the Fibonacci series:");
        for (int j = 0; j < n; j++) {
            System.out.print(fibonacciSeries[j] + " ");
        }
    }
}
