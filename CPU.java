import java.util.*;
import java.io.*;

public class CPU {

        ArrayList<Account> accountArray = new ArrayList<Account>();
        Scanner scan = new Scanner(System.in);

        public void loginMenu() {
             boolean loop = true;

             while (loop) {
                 System.out.println("");
                 System.out.println("Oi mate, Welcome to Netflix n' Chill, lay back and enjoy");
                 Timer.delayFunction();
                 System.out.println("Press 1 to sign in");
                 System.out.println("Press 2 to sign up");
                 int input = scan.nextInt();
                 switch (input) {
                     case 1:
                     signIn();
                     break;

                     case 2:
                     signUp();
                     break;

                     default:
                     System.out.println("Wrong Choice, please try again");
                     break;
                 }
             }
        }
       
        public void signUp() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Creating new account");
            System.out.println(" ");
            System.out.print(" Enter full name: ");
            String input1 = scan.nextLine();
            System.out.print("Enter email: ");
            String input2 = scan.next();
            System.out.print("Enter password: ");
            String input3 = scan.next();
            accountArray.add(new Account(input1, input2, input3, true, new Statistics()));
            System.out.println("");
            Timer.delayFunction();
            System.out.println("grats chum, u now have an account eh");
            System.out.println("");
        }

        public void signIn() {
            Scanner scan = new Scanner(System.in);
            boolean loop = true;
            System.out.println("Signing in comrade");
            System.out.println(" ");

            while (loop) {
                System.out.print("Enter email: ");
                String input1 = scan.next();
                System.out.print("Enter password: ");
                String input2 = scan.next();
                System.out.println(" ");

                for (int i = 0; i<accountArray.size(); i++) {
                    if(input1.equals(accountArray.get(i).getEmail()) && input2.equals(accountArray.get(i).getPassword())) {
                        Timer.delayFunction();
                        System.out.println("Signing in... /n SUCCESS");
                        System.out.println(" ");
                        accountArray.get(i).setSignedInTrue();
                        mainMenu();
                        loop = false;
                    }
                }

                if (loop) {
                    Timer.delayFunction();
                    System.out.println("WROONG, try again");
                    System.out.println(" ");
                    System.out.println("Press r to return to main menu or try again");
                    String choice = scan.next();
                    System.out.println(" ");

                    if(choice.equals("r") || choice.equals("R")){
                        signUp();
                        loop = false;
                    }
                }
            }
        }

        public void mainMenu() {
           boolean loop = true;
           Timer.delayFunction();
           System.out.println("Welcome to Main Menu, choose an option to proceed");
            while (loop) {
                 Timer.delayFunction();
                 System.out.println("1. Watch Movies");
                 System.out.println("2. Update Movies");
                 System.out.println("3. Add Movies");
                 System.out.println("4. Remove Movies");
                 System.out.println("5. Watch personal Statistics");
                 int input = scan.nextInt();
                 switch (input) {
                     case 1:
                     
                     break;

                     case 2:
                     
                     break;

                     case 3:
                     
                     break;

                     case 4:
                     
                     break;

                     case 5:
                     
                     break;

                     default:
                     System.out.println("Wrong Choice, please try again");
                     break;
                 }
             }
        }

//         public void createAccount() {

//         }

//         public void readAccount() {

//         }

//         public void updateAccount() {

//         }

//         public void deleteAccount() {
            
//         }
//     }
}