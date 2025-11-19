package Level2;

import java.util.Scanner;

public class Q118 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star = 2*n-1;
        int space = 0;
        int num=n;
        for (int i =1; i<=n; i++){
            for (int j = 1; j <= space; j++ ){
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++ ){
                int mid = star/2+1;
                System.out.print(num+" ");
                if (j<mid)
                    num--;
                else
                    num++;
            }
            num=num-2;
            space++;
            star-=2;
            System.out.println();
        }
    }
}
