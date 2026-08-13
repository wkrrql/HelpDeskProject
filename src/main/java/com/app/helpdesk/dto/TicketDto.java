package com.app.helpdesk.dto;


import com.app.helpdesk.domain.Agent;
import com.app.helpdesk.domain.Organization;
import com.app.helpdesk.domain.Requester;
import com.app.helpdesk.domain.ticketsEnums.*;

import java.time.LocalDateTime;
import java.util.List;

public record TicketDto(
        Long id,
        String publicNumber,
        String subject,
        String description,
        Status status,
        Priority priority,
        Type type,
        Channel channel,
        List<Requester> requester,
        List<Agent> agent,
        List<Organization> organization,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        LocalDateTime firstResponseAt,
        LocalDateTime solvedAt
) {
}
