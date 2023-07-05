import java.util.ArrayList;
import java.util.List;

public class Followers {
    private String username;
    private List<String> followers;

    public Followers(String username, List<String> followers) {
        this.username = username;
        this.followers = followers;
    }

    public void addFollower(String followerUsername) {
        if (!followers.contains(followerUsername)) {
            followers.add(followerUsername);
            System.out.println(followerUsername + " is now following " + username);
        } else {
            System.out.println(followerUsername + " is already following " + username);
        }
    }

    public void removeFollower(String followerUsername) {
        if (followers.contains(followerUsername)) {
            followers.remove(followerUsername);
            System.out.println(followerUsername + " is no longer following " + username);
        } else {
            System.out.println(followerUsername + " is not following " + username);
        }
    }

    public List<String> getFollowers() {
        return followers;
    }}