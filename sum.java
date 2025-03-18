// Silvia needs to develop a program that calculates the sum of elements in an array.
//  The program prompts the user to input the size of the array and its elements, computes the sum of all elements,
//   and then displays the calculated sum.

// Input format :
// The first line of input consists of an integer N, representing the number of elements in the array.
// The second line consists of N space-separated integers representing the elements of the array.

// Output format :
// The output prints the sum of the elements in the array.
// Refer to the sample output for formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:
// 1 ≤ N ≤ 20
// -100 ≤ elements of the array ≤ 100

// Sample test cases :
// Input 1 :
// 5
// 1 2 3 4 5
// Output 1 :
// 15
// Input 2 :
// 7
// 12 65 34 80 38 51 72
// Output 2 :
// 352
// Input 3 :
// 5
// 8 -2 3 -4 6
// Output 3 :
// 11

import java.util.*;

public class sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = scanner.nextInt();
        int sum = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        System.out.println("Sum of elements in array is : " + sum);

        
    }
}
