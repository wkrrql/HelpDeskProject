package com.app.helpdesk.dto.response;


import com.app.helpdesk.domain.ticketsEnums.Channel;
import com.app.helpdesk.domain.ticketsEnums.Priority;
import com.app.helpdesk.domain.ticketsEnums.Status;
import com.app.helpdesk.domain.ticketsEnums.Type;

import java.time.LocalDateTime;
import java.util.List;

public record TicketResponse(
        Long id,
        String publicNumber,
        String subject,
        String description,
        Status status,
        Priority priority,
        Type type,
        Channel channel,
        RequesterResponse requester,
        AgentResponse agent,
        OrganizationResponse organization,
        List<MessageResponse> messages,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        LocalDateTime firstResponseAt,
        LocalDateTime solvedAt
) {
}
