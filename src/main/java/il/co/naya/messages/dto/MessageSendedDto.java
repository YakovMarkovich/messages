package il.co.naya.messages.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Builder
public class MessageSendedDto {
    private String message;
}
