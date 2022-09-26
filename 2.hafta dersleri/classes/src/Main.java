public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        //classı kullanmak için new lenmiş olması gerekiyor.
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        int sayi1 =10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1 =30;
        System.out.println(sayi2);
        //SONUÇ 10 çıkar. çünkü sayi2'ye en son sayi1 değeri atanmış

        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2={4,5,6};
        sayilar2=sayilar1; //referans numaraları eşitlendi,artık bir nesne var.
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);
        //diziler referans tiptir o yüzden değiştiğinde o da değişir.
    }

}
