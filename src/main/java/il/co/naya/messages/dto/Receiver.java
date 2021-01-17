package il.co.naya.messages.dto;

import il.co.naya.messages.senders.FacebookSender;
import il.co.naya.messages.senders.MailSender;
import il.co.naya.messages.senders.TwitterSender;
import il.co.naya.messages.senders.WhatsAppSender;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@RequiredArgsConstructor
public enum Receiver {
    FACEBOOK(new FacebookSender()), TWITTER(new TwitterSender()), WHATSAPP(new WhatsAppSender());

    private final MailSender mailSender;

    public String generateMail(String message) {
        return mailSender.generateMail(message);
    }

    @Override
    public String toString() {
        return this.name();
    }
}
