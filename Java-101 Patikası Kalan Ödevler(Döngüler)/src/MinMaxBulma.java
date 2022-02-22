import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç tane sayı girileceğini yazınız:");
        int n=input.nextInt();
        int min=0;
        int max=0;
        for(int i=0;i<n;i++){
            System.out.print("Bir sayı girin:");
            int t=input.nextInt();
            if(i==0){
                min=t;
                max=t;
            }
            else if(i>0) {
                if (min > t) {
                    min = t;
                }
                if (max < t) {
                    max = t;
                }
            }
        }
        System.out.print("En küçük sayı:"+min+ "\nEn büyük sayı:"+max);

    }
}
