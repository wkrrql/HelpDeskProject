package com.app.helpdesk.dto.response;

import com.app.helpdesk.domain.agentsEnums.Lang;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record RequesterResponse(
        Long id,
        String email,
        String name,
        String phone,
        Lang language,
        OrganizationResponse organization,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
