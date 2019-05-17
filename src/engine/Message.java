package engine;

/**
 * Created by 401-06 on 5/9/2019.
 */
public abstract class Message {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public abstract void send();
}
