import java.util.Scanner;

    public class hesapMakinesiRecursive {
    static int bir(int a,int b){
        return  a+b;
    }

    static int iki(int a,int b){

        return  a-b;
        }
        static int uc(int a,int b){

        return  a*b;
        }
        static int dort(int a,int b){
            if(b==0) {
                System.out.println("'B' sıfırdan farklı bir sayı olmalı");
                return 0;
            }
            return  a/b;
        }
        static int bes(int a,int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
            return  result;
        }
        static int altı(int a,int b){

        return  a%b;
        }
        static void yedi(int a,int b){
            System.out.println("Çevresi-->"+(2*(a+b)));
            System.out.println("Alanı-->"+(a*b));
        }

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int select;


        String menu = "1-Toplama\n"
                + "2-Çıkarma\n"
                + "3-Bölme\n"
                + "4-Çarpma\n"
                + "5-Üslü sayı hesaplama\n"
                + "6-Mod alma\n"
                + "7-Dikdörtgen alan ve çevre hesabı\n"
                + "0-Çıkış yap";

        while(true){
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz:");
            select= girdi.nextInt();

            if(select==0){
                System.out.println("Çıkış yaptınız :D");
                break;
            }

            System.out.print("Birinci değeri yazın >>");
            int a= girdi.nextInt();
            System.out.print("İkinci değeri yazın>>");
            int b= girdi.nextInt();

            switch (select){
                case 1:

                    System.out.println("Sonuc  ");
                    System.out.println(bir(a,b));
                    break;
                case 2:
                    System.out.println("Sonuc  ");
                    System.out.println(iki(a,b));
                    break;
                case 3:
                    System.out.println("Sonuc");
                    System.out.println(uc(a,b));
                    break;
                case 4:
                    System.out.println("Sonuc  ");
                    System.out.println(dort(a,b));
                    break;
                case 5:
                    System.out.println("Sonuc  ");
                    System.out.println(bes(a,b));
                    break;
                case 6:
                    System.out.println("Sonuc  ");
                    System.out.println(altı(a,b));
                    break;
                case 7:
                    System.out.println("Sonuc  ");
                    yedi(a,b);
                    break;

                default:System.out.println("Hatalı bir giriş yaptınız");
            }
        }
    }
}