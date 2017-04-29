import java.util.*;
import java.io.*;

public class CPU {

        File f1 = new File("login.txt");
        File f2 = new File("movies.txt");

        MovieDB moviedb = new MovieDB();
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
                     loop = false;
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
            try{
                Scanner scan1 = new Scanner(f1);
                PrintStream file1 = new PrintStream(f1);
                Scanner scan = new Scanner(System.in);
                while(scan1.hasNext()){
                    accountArray.add(new Account(scan1.next(), scan1.next(), scan1.next(), false, new Statistics()));
                }
                System.out.println("Creating new account");
                System.out.println(" ");
                System.out.print("Enter username: ");
                String input1 = scan.next();
                System.out.print("Enter email: ");
                String input2 = scan.next();
                System.out.print("Enter password: ");
                String input3 = scan.next();
                accountArray.add(new Account(input1, input2, input3, true, new Statistics()));

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

            while (loop) {
                System.out.print("Enter email: ");
                String input1 = scan.next();
                System.out.print("Enter password: ");
                String input2 = scan.next();
                System.out.println(" ");

                while(scan1.hasNext()){
                    // først tjekker vi om det der står i teksfilen stemmer overens med brugeren input.
                    // derefter finder vi nu den bestemte plads i arrayet for at kunne få emailen og passwordet og til sidst sammenligne.
                        if(scan1.next().equals(input1) && scan1.next().equals(input2)){
                            for(int i=0; i<accountArray.size(); i++){
                                if(accountArray.get(i).getEmail().equals(input1) && accountArray.get(i).getPassword().equals(input2)) {
                                    Timer.delayFunction();
                                    System.out.println("Signing in... /n SUCCESS");
                                    System.out.println(" ");
                                    accountArray.get(i).setSignedInTrue();
                                    mainMenu();
                                    loop = false;
                                }
                            }
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
                     watchMovies();
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


        public void watchMovies() {
            boolean loop = true;
            Timer.delayFunction();
            System.out.println("Here is the top 5 favorites of Netflix n' Chill'");
            moviedb.getTop5();
            System.out.println("Press the number of the desired movie, or press s to search for another movie");
            while (loop) {
                System.out.println("1. batman");
                System.out.println("2. mr beans ferie");
                System.out.println("3. yolomonster");
                System.out.println("3. tom og jerry THE MOVIE");
                System.out.println("3. luiz gustavos liv");
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