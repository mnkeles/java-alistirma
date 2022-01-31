import java.util.Scanner;

public class KdvTutarıHesaplayanProgram {
    public static void main(String[] args) {
        double tutar,kdvTutari,kdvliTutar;
        double kdvOrani1=0.18,kdvOrani2=0.08;
        Scanner input=new Scanner(System.in);
        tutar= input.nextDouble();

        if(tutar<=1000){
            kdvTutari=tutar*kdvOrani1;
            kdvliTutar=tutar+kdvTutari;
            System.out.println("KDV'siz tutar:"+tutar);
            System.out.println("KDV oranı:"+kdvOrani1);
            System.out.println("KDV tutarı:"+kdvTutari);
            System.out.println("KDV'li tutar:"+kdvliTutar);
        }else{
            kdvTutari=tutar*kdvOrani2;
            kdvliTutar=tutar+kdvTutari;
            System.out.println("KDV'siz tutar:"+tutar);
            System.out.println("KDV oranı:"+kdvOrani2);
            System.out.println("KDV tutarı:"+kdvTutari);
            System.out.println("KDV'li tutar:"+kdvliTutar);
        }
    }
}
