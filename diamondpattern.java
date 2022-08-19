package ncc;

import java.util.Scanner;

public class pattern3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int i = input.nextInt();
        System.out.println("Please enter a number: ");
        int j = input.nextInt();
        int total = i+j;
        System.out.println("Your total number is: "+total);
        int space = total-1;
        for(int k=1;k<=total;k++){
            for(int x=1;x<=space;x++){
                System.out.print(" ");
            }
            space--;
            for(int z=1;z<=(2*k)-1;z++){
                System.out.print("@");
            }
            System.out.println();
        }
        space = 1;
        for(int s=1;s<=total-1;s++){
            for(int h=1;h<=space;h++){
                System.out.print(" ");
            }
            space++;
            for(int z=1;z<=2*(total-s)-1;z++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
//Diamond shape pattern
