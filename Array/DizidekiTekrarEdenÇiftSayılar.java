import java.util.Arrays;

public class DizidekiTekrarEdenÇiftSayılar {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {6,6,5, 4, 8, 2, 2, 3, 5, 5, 4, 2};
        int[] duplicate = new int[list.length];
        int starIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i]%2==0)) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[starIndex++] = list[i];
                    }
                    break;

                }
            }
        }
        for(int i:duplicate){
            if(i!=0){
                System.out.print(i +"\t");
            }
        }
    }
}