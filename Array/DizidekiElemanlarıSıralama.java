import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlarıSıralama {
    public static void main(String [] args){
        Scanner girdi=new Scanner(System.in);
        System.out.print("Dizi boyutunu girin-->");
        int n= girdi.nextInt();
        int[] list=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Bir değer girin-->");
            list[i]=girdi.nextInt();
        }
        System.out.print("Dizinin büyükten küçüğe sıralanmış hali:");
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
