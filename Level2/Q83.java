package Level2;

import java.util.Scanner;

public class Q83 {
             public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printPattern(n);
        }
        public static void printPattern(int n){
            int star = 1;
            int space = n-1;
            int num = 1;

            for (int i = 1; i<=n; i++){
                for (int j = 1; j<=space; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j<=star; j++){
                        if (j==i) {
                            System.out.print(1+" ");
                        }
                        else {
                            System.out.print(num+" " ) ;
                            num++;
                        }

                }
                space--;
                star+=2;
                System.out.println();
            }
        }
    }


