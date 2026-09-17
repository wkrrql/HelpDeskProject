package com.app.helpdesk.dto.response;

import java.time.LocalDateTime;

public record TicketPortalResponse(
        String publicNumber,
        String subject,
        String status,
        String requesterName,
        LocalDateTime createdAt) {
}
