package il.co.naya.messages.services;
import il.co.naya.messages.dto.MessageSendedDto;
import il.co.naya.messages.dto.Receiver;
import il.co.naya.messages.senders.*;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class MessagesHandlerImpl implements MessagesHandler {

    private Map<Receiver, MailSender> map;


    @PostConstruct
    public void fillMapReceiversSenders(){
        map = new HashMap<>();
        map.put(Receiver.FACEBOOK, new FacebookSender());
        map.put(Receiver.WHATSAPP, new WhatsAppSender());
        map.put(Receiver.TWITTER, new TwitterSender());
    }

    @Override
    public MessageSendedDto sendMessage(String message, Receiver receiver) {
        return MessageSendedDto.builder().message(map.get(receiver).generateMail(message)).build();
    }
}
