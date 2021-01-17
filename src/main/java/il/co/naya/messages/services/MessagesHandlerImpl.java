package il.co.naya.messages.services;

import il.co.naya.messages.dto.MessageSendedDto;
import il.co.naya.messages.dto.Receiver;
import il.co.naya.messages.senders.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class MessagesHandlerImpl implements MessagesHandler {

    @Autowired
    private Map<Receiver, MailSender> mapReceiversSenders;

    @Override
    public MessageSendedDto sendMessage(String message, Receiver receiver) {
        return MessageSendedDto.builder().message(mapReceiversSenders.get(receiver).generateMail(message)).build();
    }
}
