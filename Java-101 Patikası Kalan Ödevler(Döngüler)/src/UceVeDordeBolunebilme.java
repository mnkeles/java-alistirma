import java.util.Scanner;

public class UceVeDordeBolunebilme {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.print("Bir sayı girin: ");
            int n= input.nextInt();
            int result=0; // Şartı sağlayan değerler toplamını  bulmak için tanımladık
            int counter=0; // kaç tane değerin şartı sağladığını alacağız ortlama bulmak için
            for(int i=1;i<=n;i++){
                if(i%3==0 && i%4==0 ){
                    System.out.println(i);
                    result+=i;
                    counter++;
                    System.out.println(counter);

                }
            }
            int avarage=result/counter;
            System.out.println("Avarage:" +avarage );
        }
    }


