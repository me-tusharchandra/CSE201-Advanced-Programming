package Product;

import Category.Category;

public class Product {
    public String name, id, details;
    public int normal_price, elite_price, prime_price, price, discount;
    public Category category;
    public Product(String Name, String ID, String Details, int Normal_price, int Elite_price, int Prime_price, int Price){
        this.name = Name;
        this.id = ID;
        this.price = Price;
        this.details = Details;
        this.normal_price = Normal_price;
        this.elite_price = Elite_price;
        this.prime_price = Prime_price;
    }
}



