import java.util.Scanner;
public class vucutKitleEndeksi {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);
        double boy,kilo,indeks;
        System.out.print("Boyunuzu metre cinsinden yazınız=");
        boy=inp.nextDouble();
        System.out.print("Kilonuzu kg cinsinden yazınız=");
        kilo=inp.nextDouble();
        indeks=boy/(kilo*kilo);
        System.out.println("Vücut kitle indeksi="+indeks);








    }
}

