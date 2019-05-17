package engine;

import java.util.ArrayList;

/**
 * @author Sina Askarnejad
 * @version 1.1
 */
public class Engine {
    ArrayList<Message> messageList = new ArrayList<>();

    /**
     * Adds <b>Messages</b> to a collection to be sent later
     * @param message a message from Message Type
     * @deprecated use {@link #addMessageToDB} instead
     * @since 1.0
     * @see Message
     * @see String#toLowerCase()
     * @see Math#abs(double)
     */
    public void addMessage(Message message){
        messageList.add(message);
    }

    /**
     *
     * @param message
     * @since 1.1
     */
    public void addMessageToDB(Message message){
        messageList.add(message);
    }
    /**
     *
     * sends all the messages saved by {@link #addMessage}
     *  تست
     */
    public void sendAll(){
       for (Message m: messageList){
            m.send();
       }
    }
}
