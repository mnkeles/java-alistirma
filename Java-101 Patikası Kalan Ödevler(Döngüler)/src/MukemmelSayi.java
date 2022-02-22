import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int result=0;
        System.out.print("Bir sayı girin:");
        int n= input.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0){
                result+=i;
            }
        }
        if(result==n){
            System.out.println(n+"  Mükemmel bir sayıdır.");
        }
        else{
            System.out.println(n+"  Mükemmel sayı değildir.");
        }
    }
}
