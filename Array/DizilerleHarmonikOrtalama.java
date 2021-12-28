public class DizilerleHarmonikOrtalama {
    public static void main(String [] args){
        double result=0.0;
        int [] list={1,2,3};
        for(int i=0;i<list.length;i++){
            result+=1.0/list[i];
            System.out.println(result);
        }
        System.out.println("----------");
        double avarage=list.length/result;
        System.out.println(avarage);

    }
}
