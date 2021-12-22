import java.util.Scanner;

public class daireAlanıCevresi {
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
        double pi=3.14,r,x;

        System.out.println("Yarı çap giriniz:");
        r= inp.nextDouble();
        double cevre=(2*pi*r),alan=(pi*r*r);
        System.out.println("Alan="+alan);
        System.out.println("Çevre"+cevre);

        System.out.println("Daire dilimi açısı girin=");
        x= inp.nextDouble();
        double darieDilimiAlanı= (pi * (r*r) * x) / 360;
        System.out.println("Daire dilimi alanı"+darieDilimiAlanı);



    }
}
