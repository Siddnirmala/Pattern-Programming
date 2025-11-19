package Level1;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n =sc.nextInt();
        printpattern(n);

    }
    public static void printpattern(int n){
            for (int i=1; i<=n;i++){
                for (int j=1;j<=n;j++){
                    System.out.print(i%2+" ");
                }
                System.out.println();
            }

    }
}
