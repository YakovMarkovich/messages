package il.co.naya.messages.dto;

import lombok.*;

@ToString
@Getter
@Builder
public class MessageSendedDto {
    private String message;
}
