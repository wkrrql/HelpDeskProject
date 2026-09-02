package com.app.helpdesk.dto;

import com.app.helpdesk.domain.agentsEnums.Availability;
import lombok.Builder;

import java.util.List;


@Builder
public record AgentDto(
        Long id,
        String email,
        String name,
        String nickname,
        List<GroupDto> groups,
        Availability availability,
        boolean active
) {
}
