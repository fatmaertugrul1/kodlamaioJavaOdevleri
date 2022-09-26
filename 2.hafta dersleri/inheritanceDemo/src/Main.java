public class Main {
    public static void main(String[] args) {
       OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
KrediUI krediUI=new KrediUI();
krediUI.KrediHEsapla(new OgretmenKrediManager());
// BaseKrediManager OGretmen ve Tarim'ın annesi olduğu için krediHesapla
        //nın içine diğerlerini de yazabiliriz.
    }
}