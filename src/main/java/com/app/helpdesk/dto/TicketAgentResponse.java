package com.app.helpdesk.dto;

import com.app.helpdesk.domain.ticketsEnums.Priority;
import com.app.helpdesk.domain.ticketsEnums.Status;

import java.time.LocalDateTime;

public record TicketAgentResponse(
        String publicNumber,
        String subject,
        Priority priority,
        Status status,
        String requesterName,
        String agentName,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        LocalDateTime firstResponseAt,
        LocalDateTime solvedAt
) {}
