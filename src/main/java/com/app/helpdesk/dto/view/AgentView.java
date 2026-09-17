package com.app.helpdesk.dto.view;

import lombok.Builder;

@Builder
public record AgentView(
        Long id,
        String name,
        String nickname,
        String email
) {
}
