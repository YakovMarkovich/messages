package il.co.naya.messages.services;
import il.co.naya.messages.dto.MessageSendedDto;
import il.co.naya.messages.dto.Receiver;
import org.springframework.stereotype.Service;


@Service
public class MessagesHandlerImpl implements MessagesHandler {

    @Override
    public MessageSendedDto sendMessage(String message, Receiver receiver) {
        return MessageSendedDto.builder().message(receiver.generateMail(message)).build();
    }
}
