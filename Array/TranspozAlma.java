public class TranspozAlma {
    public static void main(String[] args){
        int[][] list= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int[][] listTranspoz=new int[list[0].length][list.length];
        for(int i=0;i<list.length;i++){
            for(int j=0;j<list[0].length;j++){
                listTranspoz[j][i]=list[i][j];
            }
        }

        for(int i=0;i<listTranspoz.length;i++){
            for(int j=0;j<listTranspoz[0].length;j++){
                System.out.print(listTranspoz[i][j]+" ");
            }
            System.out.println();
        }

    }
}
