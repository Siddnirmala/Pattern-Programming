package Level2;

import java.util.Scanner;

public class Q95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star = n;
        int space = 0;

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=space; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=star; j++){
                System.out.print(i%2+"   " ) ;
            }
            space++;
            star--;
            System.out.println();
        }
    }
}
