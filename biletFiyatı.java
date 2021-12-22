import java.util.Scanner;

public class biletFiyatı {
    public static void main(String[] args){
        double km,fiyat,yasIndirimi,tutar,yolculukIndirimi;
        int tip,yas;
        Scanner input=new Scanner(System.in);
        System.out.print("Yolculuk tipi(1 => Tek Yön , 2 => Gidiş Dönüş ):");
        tip= input.nextInt();
        System.out.print("Yaşınız:");
        yas= input.nextInt();
        System.out.print("Yolculuk km'si:");
        km= input.nextInt();
        if(km>0){
            switch (tip) {
                case 1:
                    if(yas<=0){
                        System.out.println("Hatalı yaş girdiniz");
                    }
                else if((1<=yas) && (yas<12)){
                    fiyat=km*0.1;
                    yasIndirimi=fiyat*0.5;
                    tutar=(fiyat-yasIndirimi);
                    System.out.println("Tutar:"+tutar+"Tl");
                }
                else if((12<=yas) && (yas<24)){
                    fiyat=km*0.1;
                    yasIndirimi=fiyat*0.1;
                    tutar=(fiyat-yasIndirimi);
                    System.out.println("Tutar:"+tutar);
                }
                else if((65<=yas)){
                    fiyat=km*0.1;
                    yasIndirimi=fiyat*0.3;
                    tutar=(fiyat-yasIndirimi);
                    System.out.println("Tutar:"+tutar);
                }
                break;
                case 2:
                    if(yas<=0){
                        System.out.println("Hatalı yaş girdiniz");
                    }
                    else if((1<=yas) && (yas<12)){
                        fiyat=km*0.1;
                        yasIndirimi=fiyat*0.5;
                        yolculukIndirimi=fiyat*0.2;
                        tutar=((fiyat-yasIndirimi)-yolculukIndirimi)*2;
                        System.out.println("Tutar:"+tutar);
                    }
                    else if((12<=yas) && (yas<24)){
                        fiyat=km*0.1;
                        yasIndirimi=fiyat*0.1;
                        yolculukIndirimi=fiyat*0.2;
                        tutar=(fiyat-yasIndirimi-yolculukIndirimi)*2;
                        System.out.println("Tutar:"+tutar);
                    }
                    else if((65<=yas)){
                        fiyat=km*0.1;
                        yasIndirimi=fiyat*0.3;
                        yolculukIndirimi=fiyat*0.2;
                        tutar=(fiyat-yasIndirimi-yolculukIndirimi)*2;
                        System.out.println("Tutar:"+tutar);
                    }
                    break;
                default: System.out.println("Hatalı yolculuk tipi girdiniz.");



            }
        }
        else{
            System.out.println("Hatalı mesafe girdniz.");
        }
    }
}
