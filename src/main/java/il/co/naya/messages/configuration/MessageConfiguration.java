package il.co.naya.messages.configuration;

import il.co.naya.messages.dto.Receiver;
import il.co.naya.messages.senders.FacebookSender;
import il.co.naya.messages.senders.MailSender;
import il.co.naya.messages.senders.TwitterSender;
import il.co.naya.messages.senders.WhatsAppSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MessageConfiguration {

    @Bean
    public Map<Receiver, MailSender> mapReceiversSenders(){
        Map<Receiver, MailSender> map = new HashMap();
        map.put(Receiver.FACEBOOK, new FacebookSender());
        map.put(Receiver.WHATSAPP, new WhatsAppSender());
        map.put(Receiver.TWITTER, new TwitterSender());
        return map;
    }
}
