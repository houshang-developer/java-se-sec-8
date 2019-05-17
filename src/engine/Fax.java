package engine;

/**
 * Created by 401-06 on 5/9/2019.
 */
public class Fax extends Message {
    private String number;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Fax(String content, String number) {
        setContent(content);
        setNumber(number);
    }
    public void send(){
        System.out.println("Fax sent to "+getNumber()+" with content : "+getContent());
    }
}
