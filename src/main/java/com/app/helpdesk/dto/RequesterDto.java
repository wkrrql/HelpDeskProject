package com.app.helpdesk.dto;

import com.app.helpdesk.domain.Organization;
import com.app.helpdesk.domain.agentsEnums.Lang;

import java.util.List;

public record RequesterDto(
        Long id,
        String email,
        String name,
        String phone,
        Lang language,
        List<Organization> organization

) {
}
