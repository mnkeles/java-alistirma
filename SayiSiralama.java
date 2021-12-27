import java.sql.SQLOutput;
import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x,y,z;
        System.out.println("Üç sayı girin");
        x= input.nextInt();
        y= input.nextInt();
        z= input.nextInt();
        if((x>y)&&(x>z)){
            if((y>z)){
                System.out.println("x>y>z");
            }
            else{
                System.out.println("x>z>y");
            }
        }
        else if((y>x)&&(y>z)){
            if(x>z){
                System.out.println("y>x>z");
            }
            else{
                System.out.println("y>z>x");
            }

        }
        else{
            if(x>y){
                System.out.println("z>x>y");
            }
            else{
                System.out.println("z>y>x");
            }
        }

    }
}
