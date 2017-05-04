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

    public int getProductionYear(){
        return this.productionYear;
    }

    public String getMaleLead(){
        return this.maleLead;
    }

    public String getFemaleLead(){
        return this.femaleLead;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }

    public void setProductionYear(int productionYear){
        this.productionYear = productionYear;
    }

    public void setMaleLead(String maleLead){
        this.maleLead = maleLead;
    }

    public void setFemaleLead(String femaleLead){
        this.femaleLead = femaleLead;
    }

    public String toString(){
        return "" + movieName + " " +  productionYear + " " + maleLead + " " + femaleLead + " " + watchCount;
    }
}