package Level2;

import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star = 1;
        int space = n-1;

        for (int i = 1; i<=n; i++){
            int num=1;
            for (int j = 1; j<=space; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=star; j++){
                System.out.print(num%2+"   " ) ;
                num++;
            }
            space--;
            star++;
            System.out.println();
        }
    }
}
