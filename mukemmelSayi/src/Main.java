public class Main {
    public static void main(String[] args) {

        //bölümlerinin toplamı kendisine eşit olan sayıya mükemmel sayı denir.
        int number = 5;
        int toplam = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam = toplam + i;
            }
            if (number == toplam) {
                System.out.println("sayi mükemmeldir");
            } else {
                System.out.println("sayı mükemmel değil");
            }
        }
    }
}