package com.app.helpdesk.dto;

public record OrganizationDto(
        Long id,
        String domain,
        String notes,
        boolean publicTickets,
        String policy
) {}
