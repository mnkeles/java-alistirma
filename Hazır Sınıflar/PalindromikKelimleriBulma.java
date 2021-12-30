public class PalindromikKelimleriBulma {
    static boolean isPalindrom(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
           if (str.charAt(i)==str.charAt(j))
            return true;
            i++;
            j--;
        }

        return  false;
    }
    public static void main(String [] args){
        System.out.println(isPalindrom("abba"));

    }
}
