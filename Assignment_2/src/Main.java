import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;


public class Main {
    static int app0 = 1; //app variables
    static boolean deals1 = true;
    // Changes: change the admin1 to false when admin enter details
    static String admin_username, admin_password;
    static int actions1 = 0; // action variables
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while(app0 != 5){
            System.out.println("Welcome to FLIPZON");
            System.out.println();
            System.out.println("    1.) Enter as Admin");
            System.out.println("    2.) Explore the Product Catalog");
            System.out.println("    3.) Show available deals");
            System.out.println("    4.) Enter as Customer");
            System.out.println("    5.) Exit the Application");
            app0 = sc.nextInt();
            if(app0 > 5 || app0 < 1)
                System.out.println("Wrong choice entered. \nTry again !!!");
            else if(app0 == 1){
                Admin.admin();
            }
            else if(app0 == 3){
                Deals.deals();
            }
        }
    }

    // Classes
    // 1. Admin - admin(), action()
    // 2. Deals - deals()
    static class Admin{
        static int ad_count = 0;
         static boolean check1 = true;
        public static void admin(){
            System.out.println("Dear Admin:");
            System.out.println();
            System.out.println("Please enter your username and password");
            sc.nextLine();
            if(ad_count == 0) {
                admin_username = sc.nextLine();
                admin_password = sc.nextLine();

                System.out.println("Welcome " + admin_username + "!!!!");
                action();
                ad_count++;
            }
            else {
                while(check1) {
                    String user = sc.nextLine();
                    String pass = sc.nextLine();
                    if (Objects.equals(user,admin_username) && Objects.equals(pass, admin_password)) {
                        check1 = false;
                        action();
                    } else {
                        System.out.println("Wrong credentials entered. \nTry Again!!!");
                    }
                }

            }

        }

        public static void action(){
            int in1;
            System.out.println("Please choose any one of the following actions:");
            System.out.println();
            System.out.println("    1.) Add category");
            System.out.println("    2.) Delete category");
            System.out.println("    3.) Add Product");
            System.out.println("    4.) Delete Product");
            System.out.println("    5.) Set Discount on Product");
            System.out.println("    6.) Add giveaway deal");
            System.out.println("    7.) Back");
            in1 = sc.nextInt();
            if (in1 == 7){
                app0 = 0;
            }


        }
    }


    static class Deals {
        public static void deals() {
            if (deals1) {
                System.out.println("Dear User, there are no deals for now!!! Please check regularly for exciting deals.\n");
            }
        }
    }
}