package com.app.helpdesk.dto.response;

import com.app.helpdesk.domain.agentsEnums.Availability;
import lombok.Builder;

import java.util.List;


@Builder
public record AgentResponse(
        Long id,
        String email,
        String name,
        String nickname,
        List<GroupResponse> groups,
        Availability availability,
        boolean active
) {
}
