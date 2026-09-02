package com.app.helpdesk.dto;

import lombok.Builder;

import java.util.List;

@Builder
public record GroupDto(
        Long id,
        String name,
        String description,
        List<AgentDto> agents
) {
}
