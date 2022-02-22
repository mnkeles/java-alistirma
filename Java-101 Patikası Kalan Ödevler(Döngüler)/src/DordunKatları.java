import java.util.Scanner;

public class DordunKatları {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int result=0;
        System.out.print("Kaç adet sayı girilecek: ");
        int t= input.nextInt();
        for(int i=0;i<t;i++){
            System.out.print("Bir sayı girin:");
            int n= input.nextInt();
            if( n%4==0){  // Dörte tam bölünen bütün sayılar çift sayıdır zaten.
                result+=n;
            }

        }
        System.out.print("Dörte tam bölünen çift sayıların toplamı:"+result);
    }
}
