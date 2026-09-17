package com.app.helpdesk.dto.response;

import com.app.helpdesk.dto.view.AgentView;
import lombok.Builder;

import java.util.List;

@Builder
public record GroupResponse(
        Long id,
        String name,
        String description,
        List<AgentView> agents
) {
}
