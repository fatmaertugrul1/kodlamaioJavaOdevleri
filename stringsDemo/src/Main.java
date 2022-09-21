public class Main {
    public static void main(String[] args) {
        String mesaj = "   Bugün hava çok güzel   ";
        System.out.println("eleman sayısı:" + mesaj.length());
        System.out.println("beşinci eleman:" + mesaj.charAt(4));

        /*System.out.println(mesaj.concat("yaşasınn"));
       String mesaj2= mesaj.concat("yaşasınn");

       System.out.println(mesaj2);
        System.out.println(mesaj2.endsWith("n"));

        char[] karakterler= new char[5];
        mesaj.getChars(0,5,karakterler,0);
        //.getChars karakterler deki 0 dan 5 e karakterleri çağırıyor, 5i almıyor.
        System.out.println(karakterler);

        System.out.println(mesaj.indexOf("a"));
        //a nın kaçıncı karakter olduğunu söylüyor,ilk bulduğu a yı söylüyor.
        System.out.println(mesaj.lastIndexOf("üz"));
*/
        System.out.println(mesaj.replace(' ', '-')); //sürekli olarak değiştirmek isterek stringle değişken atamalıyız.
        System.out.println(mesaj);
        System.out.println(mesaj.substring(5, 25)); //ikinci kısmı boş bırakırsakta sonuna kadar yazar.

        //burada ; expected hatası veriyor ama anlamadım. for (String kelime= mesaj.split(" "))
        // mesajdakileri boşluğa göre ayır dedik split yani.
        {
            // System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase()); //tüm büyük harfleri küçük harfe çeviriyor, toUpperCase hepsini büyük harf yapıyor.
        System.out.println(mesaj.trim( )); //baştaki ve sondaki boşlukları kesti.
    }
}