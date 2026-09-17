package com.app.helpdesk.mapper;

import com.app.helpdesk.domain.Ticket;
import com.app.helpdesk.domain.ticketsEnums.Channel;
import com.app.helpdesk.domain.ticketsEnums.Priority;
import com.app.helpdesk.domain.ticketsEnums.Type;
import com.app.helpdesk.dto.command.CreateTicketRequest;
import com.app.helpdesk.dto.response.TicketAgentResponse;
import com.app.helpdesk.dto.response.TicketResponse;
import com.app.helpdesk.dto.response.TicketPortalResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class TicketMapper {

    private final RequesterMapper requesterMapper;
    private final AgentMapper agentMapper;
    private final OrganizationMapper organizationMapper;
    private final MessageMapper messageMapper;
    private final StatusMapper statusMapper;

    public TicketResponse toDto(Ticket ticket) {
        if (ticket == null) return null;

        return new TicketResponse(
                ticket.getId(),
                ticket.getPublicNumber(),
                ticket.getSubject(),
                ticket.getDescription(),
                ticket.getStatus(),
                ticket.getPriority(),
                ticket.getType(),
                ticket.getChannel(),
                requesterMapper.toResponse(ticket.getRequester()),
                agentMapper.toResponse(ticket.getAgent()),
                organizationMapper.toResponse(ticket.getOrganization()),
                messageMapper.toResponseList(ticket.getMessageArrayList()),
                ticket.getCreatedAt(),
                ticket.getUpdatedAt(),
                ticket.getFirstResponseAt(),
                ticket.getSolvedAt()
        );
    }

    public TicketPortalResponse toPortalResponse(Ticket ticket) {
        if (ticket == null) return null;

        return new TicketPortalResponse(
                ticket.getPublicNumber(),
                ticket.getSubject(),
                statusMapper.mapStatusForClient(ticket.getStatus()),
                ticket.getRequester() != null ? ticket.getRequester().getName() : null,
                ticket.getCreatedAt()
        );
    }

    public TicketAgentResponse toAgentResponse(Ticket ticket) {
        if (ticket == null) return null;

        return new TicketAgentResponse(
                ticket.getPublicNumber(),
                ticket.getSubject(),
                ticket.getPriority(),
                ticket.getStatus(),
                ticket.getRequester() != null ? ticket.getRequester().getName() : null,
                ticket.getAgent() != null ? ticket.getAgent().getNickname() : "Не назначен",
                ticket.getCreatedAt(),
                ticket.getUpdatedAt(),
                ticket.getFirstResponseAt(),
                ticket.getSolvedAt()
        );
    }

    public List<TicketPortalResponse> toPortalResponseList(List<Ticket> tickets) {
        if (tickets == null) return null;
        return tickets.stream()
                .map(this::toPortalResponse)
                .collect(Collectors.toList());
    }

    public List<TicketResponse> toDtoList(List<Ticket> tickets) {
        if (tickets == null) return null;
        return tickets.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Ticket toEntity(CreateTicketRequest request) {
        if (request == null) return null;

        return Ticket.builder()
                .subject(request.subject())
                .description(request.description())
                .priority(request.priority() != null ? request.priority() : Priority.NORMAL)
                .type(request.type() != null ? request.type() : Type.QUESTION)
                .channel(request.channel() != null ? request.channel() : Channel.PORTAL)
                .build();
    }
}
