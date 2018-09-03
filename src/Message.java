import java.util.*;

public class Message {
    private User sender;
    private String subject;
    private String content;
    private boolean readed;

    public Message(User sender, String subject, String content) {
        this.sender = sender;
        this.subject = subject;
        this.content = content;
        this.readed = false;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

}
