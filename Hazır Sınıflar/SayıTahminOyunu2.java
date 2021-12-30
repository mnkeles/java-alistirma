import java.util.Arrays;
import java.util.Scanner;

public class SayıTahminOyunu2 {
    public static void main(String[] args){
        int randomNumber=(int) (Math.random()*100);
        int right=0;
        int n;
        int[] wrong= new int[5];
        Scanner girdi=new Scanner(System.in);
        int result=0;
        int result1=0;
        while(right<5){
            System.out.print("Tahmininizi girin--->");
            n= girdi.nextInt();
            if(n<0 || n>100){
                System.out.println("Hatalı bir değer girdiniz\nLütfen 0-100 arasında bir değer girin");
                if(result1==0) {
                    System.out.println("Bir seferlik hakkınız eksilmeyecek");
                    result1++;
                }
                else{
                    right++;
                    System.out.println("Kalan hakkınız"+(5-right));


                }

                continue;
            }
            if(n==randomNumber){
                System.out.println("Doğru tahmin");
                result=1;
                break;
            }
            else {
                wrong[right]=n;
                right++;
                System.out.println("Yanlış değer girdiniz :(");
                System.out.println("Kalan hakkınız:"+(5-right));
                if(randomNumber>n){
                    System.out.println("Girdiğiniz sayı random sayıdan büyük.");
                }
                else if(n>randomNumber){
                    System.out.println("Girdiğiniz sayı random sayıdan küçük");
                }


            }


        }
        if(result==0) {
            System.out.println("Kaybettiniz");
            if(result1==0)
            System.out.println( Arrays.toString(wrong));
        }

    }
}
