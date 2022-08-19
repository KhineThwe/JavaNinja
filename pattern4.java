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

        for(int k=0;k<=total;k++){
            for(int x=2*(total-k);x>=0;x--){
                System.out.print(" ");
            }
            for(int z=0;z<=k;z++){
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}
//            @
//          @ @
//        @ @ @
//      @ @ @ @
//    @ @ @ @ @
//  @ @ @ @ @ @
//@ @ @ @ @ @ @ 

