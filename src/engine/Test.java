package engine;

/**
 * Created by 401-06 on 5/9/2019.
 */
public class Test {
    public static void main(String[] args) {
        Engine engine=new Engine();
        SMS sms =new SMS("how are you?" , "123");
        engine.addMessage(sms);
        engine.addMessage(new SMS("Thanks" , "124"));
        engine.addMessage(new Fax("product catalog", "125"));
        engine.addMessage(new Email("homework attached" , "sender@mail.com" , "receiver@mail.com" , "homework"));
        engine.sendAll();
        "hi".toLowerCase();


    }
}
