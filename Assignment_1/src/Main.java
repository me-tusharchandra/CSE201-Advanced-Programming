//Assignment 1
//Made by Tushar Chandra-2021211

import java.util.Scanner;

public class Main {
    static int app0, app1 = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (app0 != 2) {
            System.out.println("Welcome to FutureBuilder");
            System.out.println("    1.) Enter the Application");
            System.out.println("    2.) Exit the Application");
            app0 = sc.nextInt();
            if (app0 > 2 || app0 < 1) {
                System.out.println("Wrong choice entered. Try Again !!");
            }
            else if(app0 == 1){
                application();
            }
        }
    }

    public static void application(){
        System.out.println("Choose the mode you want to Enter in:-");
        System.out.println("    1.) Enter as Student Mode");
        System.out.println("    2.) Enter as Company Mode");
        System.out.println("    3.) Enter as Placement Cell Mode");
        System.out.println("    4.) Return to Main Application");
        app1 = sc.nextInt();
        if (app1 == 1) {
            student(); // calling student
        }
        else if(app1 == 2){
            company(); // calling company
        }
        else if(app1 == 3){
            placementCell(); // calling placemenCell
        }
        else System.out.println("Returning to Main Application...");
        app0 = 0;
    }

    public static void student(){ //Student Method

    }

    public static void company(){ //Company Method

    }

    public static void placementCell(){
        System.out.println("Welcome to IIIT-D Placement Cell");
        System.out.println("    1.) Open Student Registrations");
        System.out.println("    2.) Open Company Registrations");
        System.out.println("    3.) Get Number of Student Registrations");
        System.out.println("    4.) Get Number of Company Registrations");
        System.out.println("    5.) Get Number of Offered/Un-offered/Blocked Students");
        System.out.println("    6.) Get Student Details");
        System.out.println("    7.) Get Company Details");
        System.out.println("    8.) Get Average Package");
        System.out.println("    9.) Get Company Process Results");
        System.out.println("    10.) Back");
    }
}