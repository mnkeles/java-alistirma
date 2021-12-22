import java.util.Scanner;
public class NotOrtlaması {
    public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    int fizik,mat,geo,kimya,biyoloji;
        System.out.println("Fizik notunu giriniz : ");
        fizik = inp.nextInt();
        System.out.println("Mat notunu giriniz : ");
        mat = inp.nextInt();

        System.out.println("Geo notunu giriniz : ");
        geo = inp.nextInt();
        System.out.println("Kimya notun giriniz : ");
        kimya = inp.nextInt();
        System.out.println("Biyoloji notunu giriniz : ");
        biyoloji = inp.nextInt();
        double ortalama = (mat+fizik+geo+kimya+biyoloji)/5;
        System.out.println("Ortalama=" + ortalama);

        String Durum=(ortalama>=60) ? "Geçti" : "Kaldı";
        System.out.println(Durum);

    }

}
