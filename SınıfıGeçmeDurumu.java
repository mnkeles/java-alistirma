import java.util.Scanner;

public class SınıfıGeçmeDurumu {// Koşul ifadesi örneği

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Türkçe notu girin:");
        int turkce = input.nextInt();
        System.out.print("Mat notu girin:");
        int mat= input.nextInt();
        System.out.print("Fizik notu girin:");
        int fizik= input.nextInt();
        System.out.print("Kimya notu girin:");
        int kimya= input.nextInt();
        System.out.print("Müzik notu girin:");
        int muzik= input.nextInt();
        int t=0,m1=0,m2=0,f=0,k=0;
         if(turkce<=100 && turkce>=0){
             t=turkce;
         }
        if(mat<=100 && mat>=0){
             m1=mat;
        }
        if(fizik<=100 && fizik>=0){
             f=fizik;
        }if(kimya<=100 && kimya>=0){
             k=kimya;
        }
        if(muzik<=100 && muzik>=0){
             m2=muzik;
        }
        double avarage=(t+m1+m2+f+k)/5;
        System.out.println("Ortalam:"+avarage);
        if(avarage>=55)
            System.out.println("Sınıfı geçtiniz");
        else if (avarage<55)
            System.out.println("Sınıfta kaldınız");



    }
}
