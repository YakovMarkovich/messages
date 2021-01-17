package il.co.naya.messages.senders;

import il.co.naya.messages.dto.Receiver;

public class WhatsAppSender implements MailSender {
    @Override
    public String generateMail(String message) {
        return "Message \"" + message  + "\" was sended by " + Receiver.WHATSAPP;
    }
}
