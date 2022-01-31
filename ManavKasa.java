import java.util.Scanner;

public class ManavKasa {
    public static void main(String[]  args){
        Scanner input= new Scanner(System.in);
        double armut=2.14,elma=3.67, domates=1.11, muz=0.95 ,patlican=5.00,a,toplam,e,d,m,p;
        System.out.println("Alınacakların kilogramını yazınız:");

        System.out.print("Armut=");
        a=input.nextDouble();

        System.out.print("Elma=");
        e=input.nextDouble();

        System.out.print("Domates=");
        d=input.nextDouble();

        System.out.print("Muz=");
        m=input.nextDouble();

        System.out.print("Patlıcan=");
        p=input.nextDouble();

        toplam=((armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlican*p));
        System.out.print("Toplam="+ toplam);

    }

}
