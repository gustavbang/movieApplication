import java.util.*;
import java.io.*;

public class MovieDB {

    ArrayList <Movies> allMoviesArray = new ArrayList <Movies>();
    File movieFile = new File("movies.txt");
    private int num1 = 0;
    private int num2 = 0;
    private int num3 = 0;
    private int num4 = 0;
    private int num5 = 0;

    public void startUpMovieArray(){
        try{      
            Scanner scan = new Scanner(movieFile);
            while(scan.hasNext()){
                allMoviesArray.add(new Movies(scan.next(), scan.nextInt(), scan.next(), scan.next(), scan.nextInt()));
            }
        } catch(Exception lulz){
            System.out.println(lulz);
        }
    }

    public void getTop5() {
        for (int i=0; i < allMoviesArray.size(); i++) {
            if(allMoviesArray.get(i).getWatchCount()>num1){
                num4 = num5;
                num3 = num4;
                num2 = num3;
                num1 = num2;
                num1 = allMoviesArray.get(i).getWatchCount();
            }
        }
        for(int a=0; a<allMoviesArray.size(); a++){
            if(allMoviesArray.get(a).getWatchCount()<num1 && allMoviesArray.get(a).getWatchCount()>num2){
                num4 = num5;
                num3 = num4;
                num2 = num3;
                num2 = allMoviesArray.get(a).getWatchCount();
            }
        }
        for(int d=0; d<allMoviesArray.size(); d++){
            if(allMoviesArray.get(d).getWatchCount()<num2 && allMoviesArray.get(d).getWatchCount()>num3){
                num4 = num5;
                num3 = num4;
                num3 = allMoviesArray.get(d).getWatchCount();
            }
        }
        for(int e=0; e<allMoviesArray.size(); e++){
            if(allMoviesArray.get(e).getWatchCount()<num3 && allMoviesArray.get(e).getWatchCount()>num4){
                num4 = num5;
                num4 = allMoviesArray.get(e).getWatchCount();
            }
        }
        for(int t=0; t<allMoviesArray.size(); t++){
            if(allMoviesArray.get(t).getWatchCount()<num4 && allMoviesArray.get(t).getWatchCount()>num5){
                num5 = allMoviesArray.get(t).getWatchCount();
            }           
        }
        for(int s=0; s<allMoviesArray.size(); s++){
            if(allMoviesArray.get(s).getWatchCount() == num1){
                System.out.println("1. " + allMoviesArray.get(s).getMovieName());
            }
        }
        for(int b=0; b<allMoviesArray.size(); b++){
            if(allMoviesArray.get(b).getWatchCount() == num2){
                System.out.println("2. " + allMoviesArray.get(b).getMovieName());
            }
        }
        for(int c=0; c<allMoviesArray.size(); c++){
            if(allMoviesArray.get(c).getWatchCount() == num3){
                System.out.println("3. " + allMoviesArray.get(c).getMovieName());
            }
        }
        for(int o=0; o<allMoviesArray.size(); o++){
            if(allMoviesArray.get(o).getWatchCount() == num4){
                System.out.println("4. " + allMoviesArray.get(o).getMovieName());
            }
        }
        for(int f=0; f<allMoviesArray.size(); f++){
            if(allMoviesArray.get(f).getWatchCount() == num5){
                System.out.println("5. " + allMoviesArray.get(f).getMovieName());
            }
        }
    }

   public void searchMovieArray() {
        try{
            Scanner search = new Scanner(System.in);
            System.out.println("Type in name and an actor of the movie: ");
            String result = search.next();
            String result1 = search.next();
            for(int i = 0; i < allMoviesArray.size(); i++){
                if(allMoviesArray.get(i).toString().contains(result) && allMoviesArray.get(i).toString().contains(result1)){
                    System.out.println("You're now watching " + allMoviesArray.get(i).getMovieName() + ". Produced in year " + allMoviesArray.get(i).getProductionYear() + " with " + allMoviesArray.get(i).getMaleLead() + " and " + allMoviesArray.get(i).getFemaleLead() + ". Enjoy!");
                    allMoviesArray.get(i).increaseWatchCount();
                }
            } 
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public void watchMovies() {
        boolean loop = true;
        Scanner scan = new Scanner(System.in);
        Timer.delayFunction();
        System.out.println("Here is the top 5 favorites of Netflix n' Chill'");
        getTop5();
        Timer.delayFunction();
        System.out.println("Press the number of the desired movie, or press 6 to search for another movie");
        while (loop == true) {
            int input = scan.nextInt();
            switch (input) {
                case 1:
                    for(int i=0; i<allMoviesArray.size(); i++){
                        if(allMoviesArray.get(i).getWatchCount() == num1){
                            System.out.println("You're now watching " + allMoviesArray.get(i).getMovieName() + ". Produced in year " + allMoviesArray.get(i).getProductionYear() + " with " + allMoviesArray.get(i).getMaleLead() + " and " + allMoviesArray.get(i).getFemaleLead() + ". Enjoy!");
                            allMoviesArray.get(i).increaseWatchCount();
                        }
                    }
                    loop = false;   
                break;

                case 2:
                    for(int a=0; a<allMoviesArray.size(); a++){
                        if(allMoviesArray.get(a).getWatchCount() == num2){
                            System.out.println("You're now watching " + allMoviesArray.get(a).getMovieName() + ". Produced in year " + allMoviesArray.get(a).getProductionYear() + " with " + allMoviesArray.get(a).getMaleLead() + " and " + allMoviesArray.get(a).getFemaleLead() + ". Enjoy!");
                            allMoviesArray.get(a).increaseWatchCount();
                        }
                    }
                    loop = false;
                break;

                case 3:
                    for(int b=0; b<allMoviesArray.size(); b++){
                        if(allMoviesArray.get(b).getWatchCount() == num3){
                            System.out.println("You're now watching " + allMoviesArray.get(b).getMovieName() + ". Produced in year " + allMoviesArray.get(b).getProductionYear() + " with " + allMoviesArray.get(b).getMaleLead() + " and " + allMoviesArray.get(b).getFemaleLead() + ". Enjoy!");
                            allMoviesArray.get(b).increaseWatchCount();
                        }
                    }
                    loop = false;
                break;

                case 4:
                    for(int c=0; c<allMoviesArray.size(); c++){
                        if(allMoviesArray.get(c).getWatchCount() == num4){
                            System.out.println("You're now watching " + allMoviesArray.get(c).getMovieName() + ". Produced in year " + allMoviesArray.get(c).getProductionYear() + " with " + allMoviesArray.get(c).getMaleLead() + " and " + allMoviesArray.get(c).getFemaleLead() + ". Enjoy!");
                            allMoviesArray.get(c).increaseWatchCount();
                        }
                    }
                    loop = false;
                break;

                case 5:
                    for(int d=0; d<allMoviesArray.size(); d++){
                        if(allMoviesArray.get(d).getWatchCount() == num5){
                            System.out.println("You're now watching " + allMoviesArray.get(d).getMovieName() + ". Produced in year " + allMoviesArray.get(d).getProductionYear() + " with " + allMoviesArray.get(d).getMaleLead() + " and " + allMoviesArray.get(d).getFemaleLead() + ". Enjoy!");
                            allMoviesArray.get(d).increaseWatchCount();
                        }
                    }
                    loop = false;
                break;

                case 6:
                searchMovieArray();
                loop = false;
                break;


                default:
                System.out.println("Wrong Choice, please try again");
                break;
            }
        }
    }

    public void updateMovies(){
        try{
            Scanner search = new Scanner(System.in);
            System.out.println("Type in name and an actor of the movie: ");
            String result = search.next();
            String result1 = search.next();
            for(int i = 0; i < allMoviesArray.size(); i++){
                if(allMoviesArray.get(i).toString().contains(result) && allMoviesArray.get(i).toString().contains(result1)){
                    System.out.println("Type in what u want to update the movies name to");
                    String result2 = search.next();
                    System.out.println("Type in what u want to update production year to");
                    int result3 = search.nextInt();
                    System.out.println("Type in what u want to update male lead to");
                    String result4 = search.next();
                    System.out.println("Type in what u want to update female lead to");
                    String result5 = search.next();
                    allMoviesArray.get(i).setMovieName(result2);
                    allMoviesArray.get(i).setProductionYear(result3);
                    allMoviesArray.get(i).setMaleLead(result4);
                    allMoviesArray.get(i).setFemaleLead(result5);
                }
            } 
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public void addMovies(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in the name of the movie");
        String movieName = scan.next();
        System.out.println("Type in the production year");
        int productionYear = scan.nextInt();
        System.out.println("Type in the male lead (hint: it's Azat)");
        String maleLead = scan.next();
        System.out.println("Type in the female lead (Also Azat)");
        String femaleLead = scan.next();
        allMoviesArray.add(new Movies(movieName, productionYear, maleLead, femaleLead, 0));
        System.out.println("");
        System.out.println("Congrats homeboy, u just added a new movie to the long list of extraordinary movies in the Netflix n' Chill' collection");
    }

    public void removeMovies(){
        try{
            Scanner search = new Scanner(System.in);
            System.out.println("Type in name and an actor of the movie: ");
            String result = search.next();
            String result1 = search.next();
            for(int i = 0; i < allMoviesArray.size(); i++){
                if(allMoviesArray.get(i).toString().contains(result) && allMoviesArray.get(i).toString().contains(result1)){
                    System.out.println("Are you sure u want to remove " + result + " from the movie collection?");
                    System.out.println("Press y to delete or random key to return to main menu");
                    String choice = search.next();
                    if(choice.equals("Y") || choice.equals("y")){
                        allMoviesArray.remove(i);
                        System.out.println("Gratz noob, u just removed " + result + " from Netflix n' Chill's awesome movie collection");
                        num1 = 0;
                        num2 = 0;
                        num3 = 0;
                        num4 = 0;
                        num5 = 0;
                    }
                }
            } 
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public void updateMovieFile(){
        try{
            PrintStream file = new PrintStream(movieFile);
            for(int i=0; i<allMoviesArray.size(); i++){
                file.println(allMoviesArray.get(i));           
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public Movies searchAndReturn() {
        try{
            Scanner search = new Scanner(System.in);
            System.out.println("Type in name and an actor of the movie: ");
            String result = search.next();
            String result1 = search.next();
            for(int i = 0; i < allMoviesArray.size(); i++){
                if(allMoviesArray.get(i).toString().contains(result) && allMoviesArray.get(i).toString().contains(result1)){
                    return allMoviesArray.get(i);
                }
            } 
        } catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}