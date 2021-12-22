import java.util.Scanner;

public class fibonacciSerisi2 {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı girin -->");
        int n= inp.nextInt();
        int n1=0,n2=1,toplam,i;
        //System.out.print(n1+"  "+n2);
        for(i=1;i<=n;i++){

            System.out.print(n1+"  ");
            toplam=n1+n2;
            n1=n2;
            n2=toplam;

        }

    }
}
