import java.util.*;
import java.io.*;

public class MovieDB {

    ArrayList<Movies> allMoviesArray = new ArrayList<Movies>();

    public void getTop5() {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;

        for (int i=0; i < allMoviesArray.size(); i++) {
            
            if(allMoviesArray.get(i).getWatchCount()>num1){
                num4 = num5;
                num3 = num4;
                num2 = num3;
                num1 = num2;
                num1 = allMoviesArray.get(i).getWatchCount();
            }
            if(allMoviesArray.get(i).getWatchCount()<num1 && allMoviesArray.get(i).getWatchCount()>num2){
                num4 = num5;
                num3 = num4;
                num2 = num3;
                num2 = allMoviesArray.get(i).getWatchCount();
            }
            if(allMoviesArray.get(i).getWatchCount()<num2 && allMoviesArray.get(i).getWatchCount()>num3){
                num4 = num5;
                num3 = num4;
                num3 = allMoviesArray.get(i).getWatchCount();
            }
            if(allMoviesArray.get(i).getWatchCount()<num3 && allMoviesArray.get(i).getWatchCount()>num4){
                num4 = num5;
                num4 = allMoviesArray.get(i).getWatchCount();
            }
            if(allMoviesArray.get(i).getWatchCount()<num4 && allMoviesArray.get(i).getWatchCount()>num5){
                num5 = allMoviesArray.get(i).getWatchCount();
            }
        }

        for(int a=0; a<allMoviesArray.size(); a++){
            if(allMoviesArray.get(a).getWatchCount() == num1){
                System.out.println(allMoviesArray.get(a));
            }
        }
        for(int b=0; b<allMoviesArray.size(); b++){
            if(allMoviesArray.get(b).getWatchCount() ==num2){
                System.out.println(allMoviesArray.get(b));
            }
        }
        for(int c=0; c<allMoviesArray.size(); c++){
            if(allMoviesArray.get(c).getWatchCount() == num3){
                System.out.println(allMoviesArray.get(c));
            }
        }
        for(int d=0; d<allMoviesArray.size(); d++){
            if(allMoviesArray.get(d).getWatchCount() == num4){
                System.out.println(allMoviesArray.get(d));
            }
        }
        for(int e=0; e<allMoviesArray.size(); e++){
            if(allMoviesArray.get(e).getWatchCount() == num5){
                System.out.println(allMoviesArray.get(e));
            }
        }
    }


    // public void searchMovies() {

    // }

    // public void search() {

    // }

    // public void playMovie() {

    // }
}