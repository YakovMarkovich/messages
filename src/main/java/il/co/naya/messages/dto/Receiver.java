package il.co.naya.messages.dto;

import il.co.naya.messages.senders.FacebookSender;
import il.co.naya.messages.senders.MailSender;
import il.co.naya.messages.senders.TwitterSender;
import il.co.naya.messages.senders.WhatsAppSender;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;


@RequiredArgsConstructor
public enum Receiver {

    FACEBOOK(), TWITTER(), WHATSAPP();


    @Override
    public String toString() {
        return this.name();
    }
}
