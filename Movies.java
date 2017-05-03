public class Movies {
    private String movieName;
    private int productionYear;
    private String maleLead;
    private String femaleLead;
    private int watchCount;


    public Movies(String movieName, int productionYear, String maleLead, String femaleLead, int watchCount) {
        this.movieName = movieName;
        this.productionYear = productionYear;
        this.maleLead = maleLead;
        this.femaleLead = femaleLead;
        this.watchCount = watchCount;
    }

    public int getWatchCount(){
        return this.watchCount;
    }

    public void increaseWatchCount(){
        this.watchCount++;
    }

    public String getMovieName(){
        return this.movieName;
    }

    public String toString(){
        return "You're now watching " + movieName + " produced in " + productionYear + " with " + maleLead + " and " + femaleLead + ". Enjoy!";
    }
}