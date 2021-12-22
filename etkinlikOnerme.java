import java.sql.SQLOutput;
import java.util.Scanner;

public class etkinlikOnerme {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        double sicaklik;
        System.out.print("Sıcaklık değeri girin:");
        sicaklik= inp.nextDouble();
        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz" );
        }
        else if((5<=sicaklik) && (sicaklik<=25)){

            if((10>sicaklik) && (sicaklik>=5)){
                System.out.println("Sinemaya gidebilirsiniz");
            }
            else if((15>=sicaklik) && (sicaklik>=10)){
                System.out.println("Pikniğe ve Sinemaya gidebilirsiniz");
            }
            else if((25>=sicaklik) && (sicaklik>15)){
                System.out.println("Pikniğe gidebilirsiniz");

        }
        }
        else if(sicaklik>25){
            System.out.println("Yüzmeye gidebilirsiniz");
        }
}
}