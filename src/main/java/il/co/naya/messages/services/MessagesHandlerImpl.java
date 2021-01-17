package il.co.naya.messages.services;

import il.co.naya.messages.dto.MessageSendedDto;
import il.co.naya.messages.dto.Receiver;
import il.co.naya.messages.senders.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class MessagesHandlerImpl implements MessagesHandler {

    @Autowired
    List<MailSender> senders;

    @Override
    public MessageSendedDto sendMessage(String message, Receiver receiver) {
        return MessageSendedDto.builder()
                .message(senders.stream().filter(s-> s.getSenderName().equalsIgnoreCase(receiver.name()))
                        .findFirst().get().generateMail(message)).build();
    }

}
