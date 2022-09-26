public class Product {
    // public Product(int id,String name, String description, double price, int stockAccount){
    //CONSTRUCTER BLOĞU OLUŞTURUYORUZ
    //   System.out.println("yapıcı blok çalıştı");


    private int _id;
    private String name;
    //name e sağ tıklayıp refactor>Encapsulate fields yazarak tüm
    //değerlerin getter ve setter ını yazdırabiliyoruz.
    private String description;
    private double price;
    private int stockAccount;
    private String renk;
    //private sadece tanımlandığı blok (yani süslü parantez içi)içinde geçerli
    //ürüne ait bilgileri verdik.


    public int get_id() {
        return _id;
    } //get diyerek id yi okuyabilir hale getirdik yani privatedan çıkardık.

    public void set_id(int id) {
        this._id = id;
        //burada ser edilen değer parametre olarak verilmelidir.
        //this içinde bulunduğum classtaki demek.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAccount() {
        return stockAccount;
    }

    public void setStockAccount(int stockAccount) {
        this.stockAccount = stockAccount;
    }

    public String getRenk() {
        return renk;
    }
}


