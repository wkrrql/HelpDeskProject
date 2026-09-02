package com.app.helpdesk.dto;

import com.app.helpdesk.domain.agentsEnums.Lang;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record RequesterDto(
        Long id,
        String email,
        String name,
        String phone,
        Lang language,
        OrganizationDto organization,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
