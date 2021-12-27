import java.util.Scanner;

public class TersUcgen {
    public static void main(String[ ]args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı girin:");
        int n= inp.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;1<=(i-k);k++){
                System.out.print(" ");
                }
            for(int m=0;m<=(2*n)-(2*i);m++){
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
