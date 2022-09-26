public class Main {
    public static void main(String[] args) { // args= argümanlar
       //metod ve fonksiyon aynı şeyler ve onları kendimizi tekrar
        //etmemek için kullanıyoruz.

        String mesaj="bugun hava çok güzel";
// mesaj.substring(0,2); // bunu dediğimizde bize bir şey yazdırmıyor.
  String yenimesaj = mesaj.substring(0,5);
  System.out.println(yenimesaj);// bu şekilde verir
        int sayi=topla(3,5);
        System.out.println(sayi);
        int toplam =topla2(2,3,5,7,8);
        System.out.println(toplam);
    }

    public static void ekle(){
    // void ile işi yaptırırız.
    System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }

    public static void guncelle(){
        return; //bu fonksiyonu bitir yani çık demek.
    }
public static int topla(int sayi1,int sayi2){
        //bu fonksiyon int türünde bir değer döndürür.

    return sayi1+sayi2;

    //bu bitir ama 5 döndür demek.
}
public static int topla2(int...sayilar) {
//3 nokta koymak birkaç tane int giricem demek, dizi gibi.
    int toplam = 0;
    for (int sayi :sayilar) {
        toplam += sayi;
    }
    return toplam;
}
public static String sehirVer(){
        return "Ankara";
}




}