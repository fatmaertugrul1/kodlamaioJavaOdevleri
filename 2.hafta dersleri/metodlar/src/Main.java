public class Main {
    public static void main(String[] args) {

        sayiBulmaca();// metodu çağırmak için böyle yazmak yeterli,tabi aynı classtaysa
        int [] sayilar = new int[] {1,2,5,7,9,0};
        int aranacak =6;
        boolean varMi =false;

        for(int sayi: sayilar)
        {
        if(sayi==aranacak){
            varMi=true;
            break;
        }
        }
        String mesaj=" ";
        if(varMi){
            mesaj= "sayı mevcuttur:"+aranacak;
            mesajVer(mesaj);


        } else {
            System.out.println("sayı mevcut değildir: "+ aranacak);
        }
    }
    public static void sayiBulmaca(){ //metodun ismi sayıBulmaca

    }
   // public static void mesajVer(int aranacak){ //int aranacak yazarak diğer metodun
        // içinde tanımlı olduğu için (aranacak) burda görünmemesi
        //hatasını düzeltiyoruz( yoksa printLnin içinde kırmızı yanıyor) buna da parametreli metod deniyor.
       // System.out.println("sayı mevcuttur:"+aranacak);
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }
}
