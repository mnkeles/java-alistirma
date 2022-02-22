import java.util.Scanner;

public class HesapMakinesi { // Koşul ifadesi örneği
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int n1= input.nextInt();
        System.out.print("İkinci bir sayı girin:");
        int n2= input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n5-Çıkış");
        System.out.print("Bir işlem seçin:");
        int m= input.nextInt();
        switch (m){
            case 1:
                System.out.println(n1+" + "+n2+" = "+(n1+n2) );
                break;
            case 2:
                System.out.println(n1+" - "+n2+" = "+(n1-n2) );
                break;
            case 3:
                System.out.println(n1+" * "+n2+" = " +(n1*n2));
                break;
            case 4:
                if(n2==0){
                    System.out.println("Bir sayı sıfıra bölünmez");
                }
                else
                System.out.println(n1+" / "+n2+" = "+(n1/n2) );
                break;
            case 5:
                System.out.println("Çıkış yapılıyor." );
                break;
            default:
                System.out.println("Çıkış yapılıyor");
                break;
        }
    }
}
