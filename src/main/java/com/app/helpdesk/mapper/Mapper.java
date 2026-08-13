package com.app.helpdesk.mapper;

import com.app.helpdesk.domain.*;
import com.app.helpdesk.dto.*;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public TicketDto tickerMapper(Ticket ticket){
        return new TicketDto(
                ticket.getId(),
                ticket.getPublicNumber(),
                ticket.getSubject(),
                ticket.getDescription(),
                ticket.getStatus(),
                ticket.getPriority(),
                ticket.getType(),
                ticket.getChannel(),
                ticket.getRequester(),
                ticket.getAgent(),
                ticket.getOrganization(),
                ticket.getCreatedAt(),
                ticket.getUpdatedAt(),
                ticket.getFirstResponseAt(),
                ticket.getSolvedAt()
        );
    }

    public RequesterDto requesterMapper(Requester requester){
        return new RequesterDto(
                requester.getId(),
                requester.getEmail(),
                requester.getName(),
                requester.getPhone(),
                requester.getLanguage(),
                requester.getOrganization()
        );
    }

    public AgentDto agentMapper(Agent agent){
        return new AgentDto(
                agent.getId(),
                agent.getEmail(),
                agent.getName(),
                agent.getNickname(),
                agent.getGroups(),
                agent.getAvailability(),
                agent.isActive()
        );
    }

    public OrganizationDto organizationMapper(Organization organization){
        return new OrganizationDto(
                organization.getId(),
                organization.getDomain(),
                organization.getNotes(),
                organization.isPublicTickets(),
                organization.getPolicy()
        );
    }

    public GroupDto groupMapper(Group group){
        return new GroupDto(
                group.getName(),
                group.getDescription(),
                group.getAgents()
        );
    }


}
