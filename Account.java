public class Account {
    private String username;
    private String email;
    private String password;
    private boolean signedIn = false;
    private Statistics statistics;

    public Account (String username, String email, String password, boolean signedIn, Statistics statistics) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.signedIn = signedIn;
        this.statistics = statistics;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
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
        signedIn = true;
    }

    public String toString(){
        return "" + this.username + " " + this.email + " " + this. password;
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