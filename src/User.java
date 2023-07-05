import java.util.List;

public class User {
    private int userID;
    private String userName;


    private List<User> followers1;
    private List<Posts> posts;

    public User(int userID, String userName, List<User> followers1, List<Posts> posts) {
        this.userID = userID;
        this.userName = userName;
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



        public void setFollowers (List < User > followers1) {
            this.followers1 = followers1;
        }

        public void setPosts (List < Posts > posts) {
            this.posts = posts;
        }
    }


