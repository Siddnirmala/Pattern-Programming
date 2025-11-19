package Level1;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n =sc.nextInt();
        printpattern(n);

    }
    public static void printpattern(int n){
        for (int i=1; i<=n;i++){
            for (int j=1;j<=n;j++){
                if ( i==1 || j==1 || i == n || j == n || j==i || i+j == n+1 || i == n/2+1 || j == n/2+1)
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int j = 1; j<=n;j++){
            System.out.println("** ");
        }




    }
}
