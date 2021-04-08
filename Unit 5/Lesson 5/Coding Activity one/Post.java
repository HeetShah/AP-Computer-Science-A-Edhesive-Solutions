public class Post {
    // Fields
    private String user;
    private String contents;
    private int favorites;

    // Constructor
    public Post(String u, String m, int f) {
        user = u;
        contents = m;
        favorites = f;
    }

    // getter
    public String toString() {
        return user + "\n" + contents + "\n\t" + "Favorited by " + favorites + " users";
    }

}