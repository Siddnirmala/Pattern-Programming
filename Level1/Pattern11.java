package Level1;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n =sc.nextInt();
        printpattern(n);

    }
    public static void printpattern(int n){
        int mid = n/2+1;
        for (int i=1; i<=n;i++){
            for (int j=1;j<=n;j++){
                if ( i == mid || j == mid || i<mid && j == 1 || i>mid && j == n|| j<mid && i == n || j > mid && i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}

