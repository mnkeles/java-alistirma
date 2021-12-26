import java.util.Scanner;

public class üslüSayiHesplama {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        int x,y,i,total=1;
        System.out.print("Sayı girin:");
        x= inp.nextInt();
        System.out.print("Sayı girin:");
        y= inp.nextInt();
        for(i=1;i<=y;i++){
            total*=x;


        }
        System.out.println("Cevap="+total);
    }
}
