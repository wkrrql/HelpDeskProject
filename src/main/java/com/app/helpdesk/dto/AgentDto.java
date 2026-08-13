package com.app.helpdesk.dto;

import com.app.helpdesk.domain.Group;
import com.app.helpdesk.domain.agentsEnums.Availability;

import java.util.List;

public record AgentDto(
        Long id,
        String email,
        String name,
        String nickname,
        List<Group> groups,
        Availability availability,
        boolean active
){}
