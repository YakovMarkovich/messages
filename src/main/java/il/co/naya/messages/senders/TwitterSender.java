package il.co.naya.messages.senders;

import il.co.naya.messages.dto.Receiver;
import org.springframework.stereotype.Component;

@Component
public class TwitterSender implements MailSender {
    @Override
    public String generateMail(String message) {
        return "Message \"" + message + "\" was sended by " + Receiver.TWITTER;
    }

    @Override
    public String getSenderName() {
        return Receiver.TWITTER.name();
    }

}
