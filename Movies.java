public class Movies {
    private String movieName;
    private int productionYear;
    private String maleLead;
    private String femaleLead;
    private int watchCount  = 0;


    public Movies(String movieName, int productionYear, String maleLead, String femaleLead) {
        this.movieName = movieName;
        this.productionYear = productionYear;
        this.maleLead = maleLead;
        this.femaleLead = femaleLead;
    }

    public int getWatchCount(){
        return this.watchCount;
    }

}