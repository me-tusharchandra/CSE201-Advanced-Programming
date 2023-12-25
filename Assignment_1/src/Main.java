//Assignment 1
//Made by Tushar Chandra-2021211

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    static int app0, app1, app3 = 0; // app variables for toggling
    static Scanner sc = new Scanner(System.in); //scanner function

    public static void main(String[] args) {

        while (app0 != 2) { //main application
            System.out.println("Welcome to FutureBuilder");
            System.out.println("    1.) Enter the Application");
            System.out.println("    2.) Exit the Application");
            app0 = sc.nextInt();
            if (app0 > 2 || app0 < 1) {
                System.out.println("Wrong choice entered. Try Again !!");
            }
            else if(app0 == 1){
                app0 = 2;
                application();

            }
        }
    }

    public static void application(){

        boolean run1 = true;
        while(run1) {
            System.out.println("Choose the mode you want to Enter in:-");
            System.out.println("    1.) Enter as Student Mode");
            System.out.println("    2.) Enter as Company Mode");
            System.out.println("    3.) Enter as Placement Cell Mode");
            System.out.println("    4.) Return to Main Application");
            app1 = sc.nextInt();
            if (app1 == 1) {
                Main.Student.student(); // calling student
                run1 = false;
            } else if (app1 == 2) {
                Main.Company.company(); // calling company
                run1 = false;
            } else if (app1 == 3) {
                Main.PlacementCell.placementCell(); // calling placemenCell
                run1 = false;
            } else if (app1 == 4) {
                System.out.println("Returning to Main Application...");
                app0 = 0;
                run1 = false;
            } else System.out.println("Wrong choice entered. Try Again !!");
        }
    }

    static class Student{ // class Student
        public static void student(){ // student Function

        }

        public static void studentRegistration(){ // studentRegistration Function

        }
    }

    static class Company{ // class Company
        public static void company(){ // company function

        }

        public static void companyRegistration(){
            String date1, date2 = null;
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy HH:mm");
            System.out.println("Fill in the Details:-  ");
            System.out.println("    1.) Set the Opening time for company registrations");
            System.out.println("    2.) Set the Closing time for company registrations");
            sc.nextLine(); // I am crying because I missed this and spent hours T-T
            System.out.println("Enter the Date and Time in following format: DD/MM/YY HH:MM");
            String in = sc.nextLine();
            try {
                date1 = String.valueOf(formatter.parse(in));
            } catch (ParseException e) {
                System.out.println("Invalid format \nTry Again!!!");
                companyRegistration();
            }
            try {
                date2 = String.valueOf(formatter.parse(in));
            } catch (ParseException e) {
                System.out.println("Invalid format \nTry Again!!!");
                companyRegistration();
            }
            application();

        }
    }

    static class PlacementCell {
        public static void placementCell() {
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
            app3 = sc.nextInt();
            if (app3 == 1) {
                Main.Student.studentRegistration();
            }
            else if(app3 == 2){
                Main.Company.companyRegistration();
            }
//            else if(app3 == 3){
//
//            }
//            else if(app3 == 4){
//
//            }
//            else if(app3 == 5){
//
//            }
//            else if(app3 == 6){
//
//            }
//            else if(app3 == 7){
//
//            }
//            else if(app3 == 8){
//
//            }
//            else if(app3 == 9){
//
//            }
            else if (app3 == 10) {
                application();
            }

        }
    }
}