package il.co.naya.messages.services;

import il.co.naya.messages.dto.MessageSendedDto;
import il.co.naya.messages.dto.Receiver;

public interface MessagesHandler {
    MessageSendedDto sendMessage(String message, Receiver receiver);
}
