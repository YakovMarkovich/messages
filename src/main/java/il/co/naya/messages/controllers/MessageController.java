package il.co.naya.messages.controllers;

import il.co.naya.messages.dto.MessageDto;
import il.co.naya.messages.dto.MessageSendedDto;
import il.co.naya.messages.services.MessagesHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = MessageController.REST_URL)
public class MessageController {
    static final String REST_URL = "/message";;

    @Autowired
    MessagesHandler messagesHandler;

    @PostMapping(value = "/send", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> sendMessage(@RequestBody MessageDto dto) {
        MessageSendedDto messageSendedDto = messagesHandler.sendMessage(dto.getMessage(), dto.getReceiver());
        return ResponseEntity.ok().body(messageSendedDto);
    }
}
