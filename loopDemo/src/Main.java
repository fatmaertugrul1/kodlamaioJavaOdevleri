public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i += 2) {
            //2şer 2şer atlayarak gidiyor
            System.out.println(i);
            //for döngüsünün içinde int belirtebiliyoruz

        }
        System.out.println("döngü bitti");
        //while döngüsünün içinde int belirtemiyoruz
        int i = 2;
        while (i < 7) {
            System.out.println(i);
            i += 2;

        }

        System.out.println("while döngüsü bitti");
        //do while döngüsü
        int j=14;
        do {
            System.out.println(j);
            j += 2;
        }
            while (j < 9) ;
        System.out.println("do while döngüsü bitti");


        }
    }
