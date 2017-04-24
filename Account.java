public class Account {
    private String name;
    private String email;
    private String password;
    private boolean signedIn = false;
    private Statistics statistics;

    public Account (String name, String email, String password, boolean signedIn, Statistics statistics) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.signedIn = signedIn;
        this.statistics = statistics;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setSignedInTrue() {
        signedIn = true;
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