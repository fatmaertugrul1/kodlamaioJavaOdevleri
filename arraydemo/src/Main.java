public class Main {
    public static void main(String[] args) {
        String ogrenci1="Fatma";
        String ogrenci2="Elif";
        String ogrenci3="Ayşe";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("------------");

        String[] ogrenciler = new String[3];
        ogrenciler[0]="Fatma";
        ogrenciler[1]="Elif";
        ogrenciler[2]= "Ayşe";

        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        for(String ogrenci: ogrenciler){
            System.out.println(ogrenci);
            //bu şekilde de hepsini yazdırabiliriyoruz.
        }


    }
}