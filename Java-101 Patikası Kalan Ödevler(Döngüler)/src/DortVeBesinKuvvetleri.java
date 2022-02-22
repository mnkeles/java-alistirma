import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı girin:");
        int n= input.nextInt();
        for(int i=1;i<=n;i++){
            if(i%4==0 || i%5==0){
                System.out.print(i+ "\t");
            }
        }
    }
}
