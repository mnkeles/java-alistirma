import java.util.Scanner;

public class üslüSayiHesaplama {
    static int f(int a, int b){
        int result;
        if(b==0)
            return 1;
        else if(a==1)
            return 1;
        else
        return f(a,b-1)*a;
    }
    public static void main(String[] args){
        Scanner girdi=new Scanner(System.in);
        int sonuc=f(2,3);
        System.out.println("Sonuç-->"+sonuc);

    }
}
