import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yil, mod1,mod2;
        System.out.print("Doğum yılınızı sorun:");
        yil = inp.nextInt();
        mod1 = yil % 4;
        mod2 =yil%400;
        if(mod1==0 ){
            System.out.println("Artık yıl");

        }
        else{
            if(mod2==0){
                System.out.println("Artık yıl");}
            else{
                System.out.println("Artık yıl değil");}
            }


        }

    }
