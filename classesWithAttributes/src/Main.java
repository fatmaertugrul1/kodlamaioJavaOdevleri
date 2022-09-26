public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        // CONSTRUCTİON BLOĞUYLA BU ŞEKİLDE KULLANILIR:
        // Product product = new Product(1,"laptop","asus laptop",5000,3);
        product.setName("Laptop");
        product.set_id(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAccount(3);
        //product.renk = bunu yazmamızı kabul etmiyor çünkü private yaptık

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
//classın içinde başka classlar kullanarak işimizi yaptırabiliriz

        System.out.println(product.getPrice());


    }
}
