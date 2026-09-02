package com.app.helpdesk.mapper;

import com.app.helpdesk.domain.Organization;
import com.app.helpdesk.dto.OrganizationDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrganizationMapper {


    public OrganizationDto toOrganizationDto(Organization organization) {
        if (organization == null) return null;

        return OrganizationDto.builder()
                .id(organization.getId())
                .domain(organization.getDomain())
                .notes(organization.getNotes())
                .publicTickets(organization.isPublicTickets())
                .policy(organization.getPolicy())
                .createdAt(organization.getCreatedAt())
                .updatedAt(organization.getUpdatedAt())
                .build();
    }
}
