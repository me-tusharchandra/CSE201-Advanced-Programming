package Category;
import Product.Product;
import java.util.ArrayList;

public class Category {
    public String name, id;
    public int wallet = 1000;
    public ArrayList<Product> productList = new ArrayList<>();

    public Category(String Name, String ID){
        this.name = Name;
        this.id = ID;
    }
}
