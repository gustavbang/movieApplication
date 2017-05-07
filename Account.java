import java.util.ArrayList;

public class Account {
    private String email;
    private String password;
    private boolean signedIn = false;
    ArrayList<Movies> favMoviesArray = new ArrayList<Movies>();

    public Account (String email, String password, boolean signedIn) {
        this.email = email;
        this.password = password;
        this.signedIn = signedIn;
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

    public boolean getSignedInTrue() {
        return this.signedIn;
    }

    public String toString(){
        return "" + this.email + " " + this. password;
    }

    public void addToFavorites(Movies movie) {
        favMoviesArray.add(movie);

    }

    public void watchFavorites() {
        for(int i=0; i<favMoviesArray.size(); i++){
            System.out.println(favMoviesArray.get(i));
        }
    }

}