import java.util.Scanner;

public class YıldızlarlaUcgenYapma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı girin:");
        int n= input.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=1;i<=n;i++){
            for(int k=0;1<=(i-k);k++){
                System.out.print(" ");
            }
            for(int m=0;m<=(2*n)-(2*i);m++){
                System.out.print("*");
            }

            System.out.println("");
        }

    }
}
