import java.util.Scanner;
public class hipotenusBulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double x,y,z;
        System.out.print("1.kenar uzunluğunu yazınız:");
        x= inp.nextDouble();
        System.out.print("2.kenar uzunluğunu yazınız:");
        y= inp.nextDouble();

        z=Math.sqrt((x*x)+(y*y));

        System.out.println("Hipotenüs:" +z);

    }


}
