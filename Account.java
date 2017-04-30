public class Account {
    private String email;
    private String password;
    private boolean signedIn = false;
    private Statistics statistics;

    public Account (String email, String password, boolean signedIn, Statistics statistics) {
        this.email = email;
        this.password = password;
        this.signedIn = signedIn;
        this.statistics = statistics;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSignedInTrue() {
        this.signedIn = true;
    }

    public void setSignedInFalse(){
        this.signedIn = false;
    }

    public String toString(){
        return "" + this.email + " " + this. password;
    }




    // public void createMovie() {

    // }

    // public void readMovie() {

    // }

    // public void updateMovie() {

    // }

    // public void deleteMovie() {
        
    // }
}