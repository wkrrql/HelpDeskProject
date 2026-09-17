package com.app.helpdesk.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record OrganizationResponse(
        Long id,
        String domain,
        String notes,
        boolean publicTickets,
        String policy,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
