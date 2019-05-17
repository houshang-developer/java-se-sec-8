package engine;

/**
 * Created by 401-06 on 5/9/2019.
 */
public class SMS extends Message {
    /**
     * SMS Number
     */
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public SMS(String content, String number) {
        setContent(content);
        setNumber(number);
    }
    public void send(){
        System.out.println("SMS sent to "+getNumber()+" with content : "+getContent());
    }
}
