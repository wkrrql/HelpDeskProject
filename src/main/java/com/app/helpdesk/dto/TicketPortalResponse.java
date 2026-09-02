package com.app.helpdesk.dto;

import java.time.LocalDateTime;

public record TicketPortalResponse(
        String publicNumber,
        String subject,
        String s,
        String s1,
        LocalDateTime createdAt) {
}
