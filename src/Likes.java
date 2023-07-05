import java.time.LocalDateTime;
import java.util.List;

public class Likes {
    private User username;
    private List<String> users;
    private LocalDateTime timestamp;
    private int count;

    public Likes(User username, List<String> users, LocalDateTime timestamp, int count) {
        this.username = username;
        this.users = users;
        this.timestamp = timestamp;
        this.count = count;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void addUser(String userId) {
        users.add(userId);
        count++;
    }

    public void removeUser(String userId) {
        users.remove(userId);
        count--;
    }
}
