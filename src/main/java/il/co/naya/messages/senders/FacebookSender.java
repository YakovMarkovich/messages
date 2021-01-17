package il.co.naya.messages.senders;

import il.co.naya.messages.dto.Receiver;

public class FacebookSender implements MailSender {
    @Override
    public String generateMail(String message) {
        return "Message \"" + message + "\" was sended by " + Receiver.FACEBOOK;
    }
}