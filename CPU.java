import java.util.*;
import java.io.*;

public class CPU {

        File loginFile = new File("login.txt");

        MovieDB moviedb = new MovieDB();
        ArrayList<Account> accountArray = new ArrayList<Account>();
        
        public void startUpArray(){
            try{
                moviedb.startUpMovieArray();
                Scanner scan = new Scanner(loginFile);
                while(scan.hasNext()){
                    accountArray.add(new Account(scan.next(), scan.next(), false, new Statistics()));
                }
            } catch(Exception lulz){
                System.out.println(lulz);
            }
        }

        public void loginMenu() {
             boolean loop = true;
             Scanner scan = new Scanner(System.in);
             while (loop == true) {
                 System.out.println("");
                 System.out.println("Oi mate, Welcome to Netflix n' Chill, lay back and enjoy");
                 Timer.delayFunction();
                 System.out.println("Press 1 to sign in");
                 System.out.println("Press 2 to sign up");
                 int input = scan.nextInt();
                 switch (input) {
                     case 1:
                     signIn();
                     mainMenu();
                     loop = false;
                     break;

                     case 2:
                     signUp();
                     mainMenu();
                     loop = false;
                     break;

                     default:
                     System.out.println("Wrong Choice, please try again");
                     break;
                 }
             }
        }

        public void signUp() {
            try{
                PrintStream file1 = new PrintStream(loginFile);
                Scanner scan = new Scanner(System.in);
                System.out.println("Creating new account");
                System.out.println(" ");
                System.out.print("Enter email: ");
                String input1 = scan.next();
                System.out.print("Enter password: ");
                String input2 = scan.next();
                accountArray.add(new Account(input1, input2, true, new Statistics()));
                for(int i=0; i<accountArray.size(); i++){
                    file1.println(accountArray.get(i));           
                }
                System.out.println("");
                Timer.delayFunction();
                System.out.println("grats chum, u now have an account eh");
                System.out.println("");
            } catch(Exception e){
                System.out.print(e);

            }

        }

        public void signIn() {
            Scanner scan = new Scanner(System.in);
            Scanner scan1 = new Scanner("login.txt");
            boolean loop = true;
            System.out.println("Signing in comrade");
            System.out.println(" ");

            while (loop == true) {
                System.out.print("Enter email: ");
                String input1 = scan.next();
                System.out.print("Enter password: ");
                String input2 = scan.next();
                System.out.println(" ");

               // while(scan1.hasNext()){
                    // først tjekker vi om det der står i teksfilen stemmer overens med brugeren input.
                    // derefter finder vi nu den bestemte plads i arrayet for at kunne få emailen og passwordet og til sidst sammenligne.
                        //if(scan1.next().equals(input1) && scan1.next().equals(input2)){
                            for(int i=0; i<accountArray.size(); i++){
                                if(accountArray.get(i).getEmail().equals(input1) && accountArray.get(i).getPassword().equals(input2)) {
                                    Timer.delayFunction();
                                    System.out.println("Signing in... /n SUCCESS");
                                    System.out.println(" ");
                                    accountArray.get(i).setSignedInTrue();
                                    loop = false;
                                }
                            }
                        //}
               // }

                if (loop == true) {
                    Timer.delayFunction();
                    System.out.println("WROONG, try again nub");
                    System.out.println(" ");
                    System.out.println("Don't have an account?");
                    System.out.println(" ");
                    System.out.println("Press r to sign up or random key to try again");
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
           Scanner scan = new Scanner(System.in);
           System.out.println("Welcome to Main Menu, choose an option to proceed");
            while (loop == true) {
                 Timer.delayFunction();
                 System.out.println("1. Watch Movies");
                 System.out.println("2. Update Movies");
                 System.out.println("3. Add Movies");
                 System.out.println("4. Remove Movies");
                 System.out.println("5. Watch personal Statistics");
                 int input = scan.nextInt();
                 switch (input) {
                     case 1:
                     moviedb.watchMovies();
                     System.out.println("Returning to main menu...");
                     break;

                     case 2:
                     //updateMovies();
                     break;

                     case 3:
                     //addMovies();
                     break;

                     case 4:
                     //removeMovies();
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