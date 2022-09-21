public class Main {
    public static void main(String[] args) {
        char grade = 'A';

        switch(grade) {
            case 'A':
                System.out.println("mukemmel: geçtiniz");
                break;
            case 'B':
                System.out.println("çok guzel: geçtiniz");
                        break;
            case 'C':
                System.out.println("iyi: geçtiniz");
                break;
            case'D':
                System.out.println("fena değil:geçtiniz");
                break;
            case 'F':
                System.out.println("malesef kaldınız");
                break;
            default:
                System.out.println("geçersiz not girdiniz");
        }

    }

}