package com.app.helpdesk.mapper;

import com.app.helpdesk.domain.Group;
import com.app.helpdesk.dto.AgentDto;
import com.app.helpdesk.dto.GroupDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class GroupMapper {

    private final AgentMapper agentMapper;

    public GroupDto toGroupDto(Group group) {
        if (group == null) return null;

        return GroupDto.builder()
                .id(group.getId())
                .name(group.getName())
                .description(group.getDescription())
                .agents(group.getAgents() != null
                        ? group.getAgents().stream()
                          .map(agentMapper::toAgentDto)
                          .collect(Collectors.toList())
                        : null)
                .build();
    }
}
