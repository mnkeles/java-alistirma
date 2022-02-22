import java.util.Scanner;

public class ArmstrongSayiBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı girin:");
        int n= input.nextInt();
        boolean check=true;
        int basNumber=0;
        int basToplamı=0;
        while(check){
            if(n!=0){
               basToplamı+= (n%10);
               n=n/10;
                /*n=n/10;
                basNumber++;   // Basamak sayısını hesaplar

                 */
            }
            else if(n==0)
                check=false;
        }

        System.out.println("Girilen sayının basamakları toplamı:"+basToplamı);



    }
}
