package engine;

/**
 * Created by 401-06 on 5/9/2019.
 */
public class Email extends Message {
    private String sender;
    private String receiver;
    private String subject;

    public Email(String content, String sender, String receiver, String subject) {
        setContent(content);
        setSender(sender);
        setReceiver(receiver);
        setSubject(subject);
    }


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void send(){
        System.out.println("Email sent from "+getSender()+" to "+getReceiver()+" with subject "+getSubject()+" and content : "+getContent());
    }
}
