package com.app.helpdesk.mapper;

import com.app.helpdesk.domain.Agent;
import com.app.helpdesk.dto.response.AgentResponse;
import com.app.helpdesk.dto.view.AgentView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AgentMapper {

    private final GroupMapper groupMapper;

    public AgentResponse toResponse(Agent agent) {
        if (agent == null) return null;

        return AgentResponse.builder()
                .id(agent.getId())
                .email(agent.getEmail())
                .name(agent.getName())
                .nickname(agent.getNickname())
                .groups(agent.getGroups() != null
                        ? agent.getGroups().stream()
                          .map(groupMapper::toResponse)
                          .collect(Collectors.toList())
                        : null)
                .availability(agent.getAvailability())
                .active(agent.isActive())
                .build();
    }

    public AgentView toView(Agent agent){
        if(agent == null) return null;

        return AgentView.builder()
                .id(agent.getId())
                .name(agent.getName())
                .nickname(agent.getNickname())
                .email(agent.getEmail())
                .build();
    }
}
