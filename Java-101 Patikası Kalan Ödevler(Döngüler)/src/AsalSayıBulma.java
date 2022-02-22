public class AsalSayıBulma { // 100 e kadar olan asal sayıları bulan program
    public static void main(String[] args) {
        System.out.println("100 e kadar olan asal sayılar");
        for(int i=2;i<=100;i++ ){
            boolean check=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    check=false;
                    break;

                }

            }
            if(check==true){
                System.out.print(i+" ");
            }
        }
    }
}
