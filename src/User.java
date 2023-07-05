import java.util.List;

public class User {
    private int userID;
    private String userName;
    private String password;
    private List<User> followers;
    private List<Posts> posts;

    public User(int userID, String userName, String password, List<User> followers, List<Posts> posts) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.followers = followers;
        this.posts = posts;
    }

    public int getUserID () {
            return userID;
        }

        public String getUserName () {
            return userName;
        }


        public List<Posts> getPosts () {
            return posts;
        }

        public void setUserID ( int userID){
            this.userID = userID;
        }

        public void setUserName (String userName){
            this.userName = userName;
        }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFollowers (List < User > followers1) {
            this.followers = followers1;
        }

        public void setPosts (List < Posts > posts) {
            this.posts = posts;
        }
    }


