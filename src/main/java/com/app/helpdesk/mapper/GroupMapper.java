package com.app.helpdesk.mapper;

import com.app.helpdesk.domain.Group;
import com.app.helpdesk.dto.response.GroupResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class GroupMapper {

    private final AgentMapper agentMapper;

    public GroupResponse toResponse(Group group) {
        if (group == null) return null;

        return GroupResponse.builder()
                .id(group.getId())
                .name(group.getName())
                .description(group.getDescription())
                .agents(group.getAgentArrayList() != null
                ? group.getAgentArrayList().stream()
                  .map(agentMapper::toView)
                  .collect(Collectors.toList())
                  :null)
                .build();
    }
}
