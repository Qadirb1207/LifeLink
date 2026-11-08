import java.util.InputMismatchException;
import java.util.Scanner;
import models.*;
public class Main {
    //method for main menu
    public static void showMainMenu(){
        System.out.println("1. Admin Registration");
        System.out.println("2. Admin Login");
        System.out.println("3. Customer Registration");
        System.out.println("4. Customer Login");
        System.out.println("5. Exit");
        System.out.println();
        System.out.print("Enter your choice = ");
    }

    //method for customer menu
    public static void customerMenu(){
        System.out.println("1. Donate Blood");
        System.out.println("2. Search Available Blood");
        System.out.println("3. Request Blood");
        System.out.println("4. View My Requests");
        System.out.println("5. Accept / Reject Blood Offer");
        System.out.println("6. Logout");
        System.out.println();
        System.out.print("Enter Your Choice = ");
    }

    //method for admin menu
    public static void adminMenu(){
        System.out.println("1. View Blood Inventory");
        System.out.println("2. View All Requests");
        System.out.println("3. process Next Request");
        System.out.println("4. Search Blood");
        System.out.println("5. View Activity History");
        System.out.println("6. Logout");
        System.out.println();
        System.out.print("Enter Your Choice = ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        //taking the user input using do-while loop
        do{
            showMainMenu();
            //handling the wrong case;
            try{
                choice = sc.nextInt();
            }catch(InputMismatchException e){                
                System.out.println("Invalid Choice! ");
                System.out.print("Enter Your Choice Again= ");
                choice = -1;
                sc.nextLine();
                try{
                    choice = sc.nextInt();
                }catch(InputMismatchException ex){   
                    System.out.println("Invalid Choice! ");
                    System.out.print("Enter Your Choice Again= ");
                    choice = -1;
                    sc.nextLine();
                    choice = sc.nextInt();
                }  
            }

            switch(choice){
                case 1:
                    System.out.println ("===== HELLO ADMIN! =====\n");
                    System.out.print("Enter Your Name = ");
                    sc.nextLine();
                    String adminName = sc.nextLine();
                    System.out.print("Enter Your City = ");
                    String adminCity = sc.nextLine();
                    System.out.print("Enter Your Username = ");
                    String adminUsername = sc.nextLine();
                    System.out.print("Enter Your Password = ");
                    String adminPassword = sc.nextLine();

                    while(adminPassword.length() < 8){
                        System.out.println("Password Length should be at least 8 characters");
                        System.out.print("Enter Your Password = ");
                        adminPassword = sc.nextLine();
                    }
                    Admin admin = new Admin(adminName, adminCity, adminUsername, adminPassword);

                    break;
                
                case 2:
                    System.out.println ("===== HELLO ADMIN! =====\n");
                    System.out.print("Enter Your Username = ");
                    String username = sc.nextLine();
                    System.out.print("Enter Your Password = ");
                    String pass = sc.nextLine();
                    break;

                case 3:
                    break;

                case 4:
                    break;

                default:
                    continue;
            }
        }while(choice != 5);

        sc.close();
    }
}
