package com.app.helpdesk.mapper;

import com.app.helpdesk.domain.Requester;
import com.app.helpdesk.dto.response.RequesterResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RequesterMapper {

    private final OrganizationMapper organizationMapper;

    public RequesterResponse toResponse(Requester requester) {
        if (requester == null) return null;

        return RequesterResponse.builder()
                .id(requester.getId())
                .email(requester.getEmail())
                .name(requester.getName())
                .phone(requester.getPhone())
                .language(requester.getLanguage())
                .organization(organizationMapper.toResponse(requester.getOrganization()))
                .createdAt(requester.getCreatedAt())
                .updatedAt(requester.getUpdatedAt())
                .build();
    }
}
