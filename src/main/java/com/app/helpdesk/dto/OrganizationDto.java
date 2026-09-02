package com.app.helpdesk.dto;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record OrganizationDto(
        Long id,
        String domain,
        String notes,
        boolean publicTickets,
        String policy,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
