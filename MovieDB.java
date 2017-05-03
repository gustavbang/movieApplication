import java.util.*;
import java.io.*;

public class MovieDB {

    ArrayList<Movies> allMoviesArray = new ArrayList<Movies>();
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
            System.out.println("Type in search: ");
            String result = search.nextLine();
            for(int i = 0; i < allMoviesArray.size(); i++){
                if(allMoviesArray.get(i).toString().contains(result)){
                    System.out.println(allMoviesArray.get(i));
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
                            System.out.println(allMoviesArray.get(i));
                            allMoviesArray.get(i).increaseWatchCount();
                        }
                    }
                    loop = false;   
                break;

                case 2:
                    for(int a=0; a<allMoviesArray.size(); a++){
                        if(allMoviesArray.get(a).getWatchCount() == num2){
                            System.out.println(allMoviesArray.get(a));
                            allMoviesArray.get(a).increaseWatchCount();
                        }
                    }
                    loop = false;
                break;

                case 3:
                    for(int b=0; b<allMoviesArray.size(); b++){
                        if(allMoviesArray.get(b).getWatchCount() == num3){
                            System.out.println(allMoviesArray.get(b));
                            allMoviesArray.get(b).increaseWatchCount();
                        }
                    }
                    loop = false;
                break;

                case 4:
                    for(int c=0; c<allMoviesArray.size(); c++){
                        if(allMoviesArray.get(c).getWatchCount() == num4){
                            System.out.println(allMoviesArray.get(c));
                            allMoviesArray.get(c).increaseWatchCount();
                        }
                    }
                    loop = false;
                break;

                case 5:
                    for(int d=0; d<allMoviesArray.size(); d++){
                        if(allMoviesArray.get(d).getWatchCount() == num5){
                            System.out.println(allMoviesArray.get(d));
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
}