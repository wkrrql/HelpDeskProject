package com.app.helpdesk.mapper;

import com.app.helpdesk.domain.Agent;
import com.app.helpdesk.dto.AgentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AgentMapper {

    private final GroupMapper groupMapper;

    public AgentDto toAgentDto(Agent agent) {
        if (agent == null) return null;

        return AgentDto.builder()
                .id(agent.getId())
                .email(agent.getEmail())
                .name(agent.getName())
                .nickname(agent.getNickname())
                .groups(agent.getGroups() != null
                        ? agent.getGroups().stream()
                          .map(groupMapper::toGroupDto)
                          .collect(Collectors.toList())
                        : null)
                .availability(agent.getAvailability())
                .active(agent.isActive())
                .build();
    }
}
