import java.util.Arrays;
import java.util.Scanner;

public class DizilerdeMinMaxDegerBulma2 {
    public static void main(String [] args){
        int[] list={10,-13,20,54,28,-19};
        Scanner girdi=new Scanner(System.in);
        System.out.print("Bir sayı girin-->");
        int sayi=girdi.nextInt();
        System.out.println("Girilen sayı-->"+sayi);
        int max=0,min=0;
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        for(int i=0;i< list.length;i++){
            if(list[i] >sayi){
                max=list[i];
                min=list[i-1];
                break;
            }


        }
        System.out.println("Girilen sayıdan küçük yakın sayı-->"+min);
        System.out.println("Girilen sayıdan büyük yakın sayı-->"+max);
    }
}
