
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message = new Message("Musa", "Paleoanthropoligists polish the bones of rap artists after I dip them in hydrochloric waters.");
        MessagingService newMessage = new MessagingService();
        newMessage.add(message);

        System.out.println(newMessage.getMessages());
    }
}
