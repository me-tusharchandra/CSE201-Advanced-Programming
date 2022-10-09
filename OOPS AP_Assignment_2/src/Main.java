import Admin.Admin;
import Category.Category;
import Product.Product;

import java.util.*;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    String username = "tushar", password = "2021211", user = null, pass = null;
    int in1 = 0, in2 = 0;

        while(in1 != 5){
            Admin iAdmin1 = new Admin(username,password); // admin object

            System.out.println("Welcome to FLIPZON");
            System.out.println();
            System.out.println("    1.) Enter as Admin");
            System.out.println("    2.) Explore the Product");
            System.out.println("    3.) Show available deals");
            System.out.println("    4.) Enter as Customer");
            System.out.println("    5.) Exit the Application");
            in1 = sc.nextInt(); // input 1

            if(in1 > 5 || in1 < 1)
                System.out.println("Wrong choice entered. \nTry again !!!");

            else if(in1 == 1){
                System.out.println("Dear Admin:");
                System.out.println();
                System.out.println("Please enter your username and password");

                while(true){
                    sc.nextLine();
                    user = sc.nextLine();
                    pass = sc.nextLine();

                    if (Objects.equals(user,username) && Objects.equals(pass, password)) {
                        System.out.println("Welcome " + username + "!!!!");

                        while(true) {
                            System.out.println("Please choose any one of the following actions:");
                            System.out.println();
                            System.out.println("    1.) Add category");
                            System.out.println("    2.) Delete category");
                            System.out.println("    3.) Add Product");
                            System.out.println("    4.) Delete Product");
                            System.out.println("    5.) Set Discount on Product");
                            System.out.println("    6.) Add giveaway deal");
                            System.out.println("    7.) Back");
                            in2 = sc.nextInt(); // input 2

                            if (in2 == 1) {
                                sc.nextLine();
                                System.out.println("Enter Category ID: ");
                                String id = sc.nextLine();
                                System.out.println("Add name of the category: ");
                                String name = sc.nextLine();

                                Category iCat1 = new Category(name, id); //  category object 1

                                System.out.println("Add a Product\nEnter product Name: ");
                                String prodName = sc.nextLine();
                                System.out.println("Enter Product ID: ");
                                String ID = sc.nextLine();
                                System.out.println("Enter price: ");
                                int price = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter details of the product");
                                String details = sc.nextLine();
                                Product iPro1 = new Product(prodName, ID, details, price, price, price, price);
                                iAdmin1.addCategory(iCat1, iPro1);
                            }
                            else if (in2 == 2) {
                                System.out.println("Enter the name of category to be deleted: ");
                                sc.nextLine();
                                String categoryName = sc.nextLine();
                                System.out.println("Enter Category ID");
                                String iid = sc.nextLine();
                                Category iCat2 = new Category(categoryName,iid);
                                int temp = 0;
                                for(int j=0; j<iAdmin1.productList.size(); j++){
                                    if(iAdmin1.categoryList.get(j).name.equals(categoryName)){
                                        iAdmin1.delCategory(iCat2,iid);
                                        temp++;
                                    }
                                }
                                if(temp == 0){
                                    System.out.println("Category does not exist!!\n");
                                }

                            }
                            else if(in2 == 3){
                                System.out.println("Add a Product\nEnter product Name: ");
                                String prodName = sc.nextLine();
                                System.out.println("Enter Product ID: ");
                                String ID = sc.nextLine();
                                System.out.println("Enter price: ");
                                int price = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Enter details of the product");
                                String details = sc.nextLine();

                                Product iPro2 = new Product(prodName, ID, details, price, price, price, price);
                                iAdmin1.addProduct(iPro2);
                            }
                            else if(in2 == 4){
                                System.out.println("Enter the name of the product to be deleted");
                                String namee = sc.nextLine();
                                System.out.println("Enter Product ID");
                                String idee = sc.nextLine();
                                int temp2 = 0;
                                for(int k = 0; k<iAdmin1.productList.size(); k++){
                                    if(iAdmin1.productList.get(k).name.equals(namee)){
                                        iAdmin1.delProduct(iAdmin1.productList.get(k),iAdmin1.productList.get(k).id);
                                        temp2++;
                                    }
                                }
                                if(temp2 == 0){
                                    System.out.println("Product does not exist !!!");
                                }
                            }

                            else if (in2 == 7) break;
                        }
                        break;

                    }
                    else{
                        System.out.println("Wrong credentials entered. \nTry Again!!!");
                    }
                }
            }
        }
    }
}

