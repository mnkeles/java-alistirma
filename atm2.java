import java.util.Scanner;

public class atm2 {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        String username, password;
        int right = 3, select, balance = 2000;

        while (right > 0) {
            System.out.print("Kullanıcı adınız:");
            username = girdi.nextLine();
            System.out.print("Parolanız:");
            password = girdi.nextLine();
            if (username.equals("nkeles") && (password.equals("12345"))) {
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = girdi.nextInt();
                    switch(select) {
                        case 1:  System.out.print("Yatırılacak Para miktarı : ");
                        int price = girdi.nextInt();
                        balance += price;
                        break;

                        case 2:
                        System.out.print("Çekilecek Para miktarı : ");
                        int x,price1 = girdi.nextInt();
                        x=(price1 > balance)? 1:0;
                        switch (x) {
                            case 1: System.out.println("Bakiye yetersiz.");
                        break;
                            default:
                            balance -= price1;
                            break;
                        }

                        break;
                        case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;}


                }while(select!=4);// Select 4 olursa while içi false olacak ve döngü duracaktır!!!
                System.out.println("İyi günler");
                break;
            }
            right--;
            System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
            switch (right){
                case 0: System.out.println("Hesabınız banlanmıştır");

            break;
                default:
                System.out.println("Kalan Hakkınız:"+right);
                break;
            }
        }

    }
}
