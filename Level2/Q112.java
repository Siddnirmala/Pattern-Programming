package Level2;

import java.util.Scanner;

public class Q112 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star = 2*n-1;
        int space = 0;
        int num=n*n;
        for (int i =1; i<=n; i++){
            for (int j = 1; j <= space; j++ ){
                System.out.print("    ");
            }
            for (int j = 1; j <= star; j++ ){
                System.out.printf("%-4d",num);
                num--;
            }
            space++;
            star-=2;
            System.out.println();
        }
    }
}
