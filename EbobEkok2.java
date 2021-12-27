import java.util.Scanner;

public class EbobEkok2 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("M1 sayısısını girin:");
        int m1 = girdi.nextInt();
        System.out.print("M2 sayısını girin:");
        int m2 = girdi.nextInt();
        int ebob=1,ekok=0;
        int i=1,k=1;
        //n1=m1,n2=m2;

        if ((m1 <= m2)) {
            while(i<=m1){
                if ((m1 % i == 0) && (m2 % i == 0)) {
                    ebob=i;
                }
                i++;
            }
            while(k<=(m1*m2)){
                if((k%m1==0)&&(k%m2==0)){
                    ekok+=k;
                    break;
                }
                k++;
            }

        } else if (m2 < m1) {
            while(i<=m2){
                if ((m1 % i == 0) && (m2 % i == 0)) {
                    ebob=i;
                }
                i++;
            }
            while(k<=(m1*m2)){
                if((k%m1==0)&&(k%m2==0)){
                    ekok+=k;
                    break;
                }
                k++;
            }
        }
        System.out.println("EBOB-->"+ebob);
        System.out.println("EKOK-->"+ekok);






    }
}
