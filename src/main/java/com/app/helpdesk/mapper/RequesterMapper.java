package com.app.helpdesk.mapper;

import com.app.helpdesk.domain.Requester;
import com.app.helpdesk.dto.RequesterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RequesterMapper {

    private final OrganizationMapper organizationMapper;

    public RequesterDto toRequesterDto(Requester requester) {
        if (requester == null) return null;

        return RequesterDto.builder()
                .id(requester.getId())
                .email(requester.getEmail())
                .name(requester.getName())
                .phone(requester.getPhone())
                .language(requester.getLanguage())
                .organization(organizationMapper.toOrganizationDto(requester.getOrganization()))
                .createdAt(requester.getCreatedAt())
                .updatedAt(requester.getUpdatedAt())
                .build();
    }
}
