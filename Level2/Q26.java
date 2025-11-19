package Level2;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }
    public static void printPattern(int n){
        int star= 1;
        int num = n*(n+1)/2;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j <= star; j++) {
                System.out.print(num + " ");
                num--;
            }
//            num=num+(2*i+1);
            star++;
            System.out.println();
        }

    }
}
