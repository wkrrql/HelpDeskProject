package com.app.helpdesk.mapper;

import com.app.helpdesk.domain.Message;
import com.app.helpdesk.dto.response.MessageResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class MessageMapper {

    public MessageResponse toResponse(Message message) {
        if (message == null) return null;

        return new MessageResponse(
                message.getId(),
                message.getContent(),
                message.getAuthorType(),
                message.getAuthorId(),
                message.getCreatedAt() != null ? message.getCreatedAt().toString() : null
        );
    }

    public List<MessageResponse> toResponseList(List<Message> messages){
        if (messages == null) return null;

        return messages.stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }
}
