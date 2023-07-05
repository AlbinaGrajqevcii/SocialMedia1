import java.time.LocalDateTime;

public class Posts {
    private String username;
    private String content;
    private LocalDateTime dateTime;

    public Posts(String username, String content) {
        this.username = username;
        this.content = content;
        this.dateTime = LocalDateTime.now();

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "username='" + username + '\'' +
                ", content='" + content + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
