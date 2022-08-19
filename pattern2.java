package ncc;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int i = input.nextInt();
        System.out.println("Please enter a number: ");
        int j = input.nextInt();
        int total = i + j;
        System.out.println("Your total number is: " + total);

        for (int k = 1; k <= total; k++) {
            for (int x = 0; x < k; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// *
// **
// ***
// ****
// *****
