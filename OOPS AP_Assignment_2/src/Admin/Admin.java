package Admin;
import java.util.ArrayList;
import Product.Product;
import Category.Category;

public class Admin {
    public String user, pass;
    public ArrayList<Product> productList = new ArrayList<>();
    public ArrayList<Category> categoryList = new ArrayList<>();

    public Admin(String Username, String Password){
        this.user = Username;
        this.pass = Password;
    }

    public void addCategory(Category categry, Product prod){
        this.categoryList.add(categry);
        categry.productList.add(prod);
    }

    public void delCategory(Category categry, String id){
        this.categoryList.remove(categry);
    }

    public void addProduct(Product prod){
        this.productList.add(prod);
    }

    public void delProduct(Product prod, String id){
        Category temp = prod.category;
        this.productList.remove(prod);
        if(temp.productList.size() == 1){
            this.delCategory(temp,temp.id);
        }
    }

    public void dicsount(String ID, int eliteDisc, int primeDisc, int normalDisc){
        for (Product product : productList) {
            if (product.id.equals(ID)) {
                product.normal_price = product.price * (1 - (normalDisc / 100));
                product.elite_price = product.price * (1 - (eliteDisc / 100));
                product.prime_price = product.price * (1 - (primeDisc / 100));
            }
        }
//        for(int i = 0; i<productList.size(); i++){
//            if(productList.get(i).id.equals(ID)){
//                productList.get(i).normal_price = productList.get(i).price*(1-(normalDisc/100));
//                productList.get(i).elite_price = productList.get(i).price*(1-(eliteDisc/100));
//                productList.get(i).prime_price = productList.get(i).price*(1-(primeDisc/100));
//            }
//        }
    }
}
