import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kombinasyon işleminin üstteki değerini giriniz:");
        int n= input.nextInt();
        System.out.print("Kombinasyon işleminin alttaki değerini giriniz:");
        int m= input.nextInt();

        int nfak=1;
        int mfak=1;
        int farkFak=1;
        for(int i=1;i<=n;i++){
            nfak=nfak*i;

        }
        for(int i=1;i<=m;i++){
            mfak=mfak*i;
        }
        for(int i=1;i<=(n-m);i++){
            farkFak=farkFak*i;
        }
        int kombinasyon=nfak/(mfak*farkFak);
        System.out.println("C("+n+","+m+")="+kombinasyon);



    }
}
