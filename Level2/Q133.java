package Level2;

import java.util.Scanner;

public class Q133 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printPattern(n);
        }
        public static void printPattern(int n){
            int star = 1;
            int space = n / 2;
            int mid = n/2+1;
            for (int i = 1; i<=n;i++ ){
                int num = 1;
                for (int j = 1; j<=space; j++){
                    System.out.print("  ");
                }
                for (int j = 1; j<=star; j++) {
                    System.out.print(num%2+"   ");
                    num++;
                }
                if (i<mid) {
                    star++;
                    space--;
                }
                else {
                    star--;
                    space++;
                }
                System.out.println();
            }
        }
}
