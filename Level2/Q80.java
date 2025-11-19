package Level2;

import java.util.Scanner;

public class Q80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star = 1;
        int space = n-1;
//        int mid = (n+1)/2+1;
        int num = 0;

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=space; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=star; j++){
                int mid = star/2+1;
                System.out.print(num+" " ) ;
                if (j<mid) {
                    num--;
                }
                else {
                    num++;
                }
            }
            space--;
            star+=2;
            System.out.println();
        }
    }
}
