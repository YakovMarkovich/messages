package il.co.naya.messages.senders;

import il.co.naya.messages.dto.Receiver;
import org.springframework.stereotype.Component;

@Component
public class WhatsAppSender implements MailSender {

    @Override
    public String generateMail(String message) {
        return "Message \"" + message  + "\" was sended by " + Receiver.WHATSAPP;
    }

    @Override
    public String getSenderName() {
        return Receiver.WHATSAPP.name();
    }

}
