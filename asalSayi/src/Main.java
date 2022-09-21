public class Main {
    public static void main(String[] args) {
        int number=45;
        int remainder = number %2; //2ye bölümünden kalanı hesaplar.
        System.out.println(remainder);
        boolean asalMı= true;
        if(number<1){
            System.out.println("geçersiz sayı girdiniz");
        }
        if(number ==1){
            System.out.println("sayı asal değildir, 1 asal olur mu hiç");
            return;
        }

        for (int i=1;i<number;i++) {
            if(number %i ==0) // numberı 24'e kadar tüm sayılara bölüyor
                 {
                asalMı = false;
                     System.out.println("sayı asal değildir");
            }
            if (asalMı == true) {


                    System.out.println("sayı asaldır");
            }

            }

            }

        }


