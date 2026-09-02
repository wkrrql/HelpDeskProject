package com.app.helpdesk.mapper;

import com.app.helpdesk.domain.Message;
import com.app.helpdesk.dto.MessageDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class MessageMapper {

    public MessageDto toMessageDto(Message message) {
        if (message == null) return null;

        return new MessageDto(
                message.getId(),
                message.getContent(),
                message.getAuthorType(),
                message.getAuthorId(),
                message.getCreatedAt() != null ? message.getCreatedAt().toString() : null
        );
    }

    public List<MessageDto> toMessageDtoList(List<Message> messages){
        if (messages == null) return null;

        return messages.stream()
                .map(this::toMessageDto)
                .collect(Collectors.toList());
    }
}
