import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[ ] args){
        Scanner inp=new Scanner(System.in);

        String username ,password;
        System.out.print("Kullanıcı adı:");
        username= inp.nextLine();


        if(username.equals("m.n.keles")){

            System.out.print("şifre:");
            password= inp.nextLine();
            if(password.equals("123456")){
                System.out.println("Giriş başarılı");
            }
            else{
                String cevap;
                System.out.println("Şifre yanlış");
                System.out.println("Şifrenizi değiştirmek ister misiniz?");
                cevap= inp.nextLine();
                if(cevap.equals("Evet")){
                    System.out.print("Yeni şifre:");
                    password= inp.nextLine();
                    if(password.equals("123456")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else{
                        System.out.println("Şifre oluşturuldu.");
                    }


                }
                else{
                    System.out.println("Try again!!");
                }
            }

        }
        else{
            System.out.println("Yanlış kullanıcı adı");}
    }
}

