import java.util.List;

public class User {
    private int userID;
    private String userName;


    private List<User> followers;
    private List<Posts> posts;

    public User(int userID, String userName, List<User> followers, List<Posts> posts) {
        this.userID = userID;
        this.userName = userName;
        this.followers = followers;
        this.posts = posts;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }

    public List<Posts> getPosts() {
        return posts;
    }

    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }

}


