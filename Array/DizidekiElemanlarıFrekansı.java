public class DizidekiElemanlarıFrekansı {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {5,5,5,2,3,4,2,3,4,1,10,20,7};

        int[] duplicates = new int[list.length];
        int sayiTekrari = 0;

        for(int i=0; i< list.length; i++){

            for(int j=0; j< list.length; j++){

                if(list[i]==list[j]) {
                    sayiTekrari++;
                }
            }
            if(sayiTekrari>0){

                if(!isFind(duplicates, list[i])){

                    System.out.println(list[i] + " sayısı " + sayiTekrari + " kere tekrar edildi.");
                    duplicates[i] = list[i];
                }
                sayiTekrari = 0;
            }

        }


    }
}



