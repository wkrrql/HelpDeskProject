package com.app.helpdesk.dto;

import com.app.helpdesk.domain.Agent;

import java.util.List;

public record GroupDto(
        String name,
        String description,
        List<Agent> agents
) {}
