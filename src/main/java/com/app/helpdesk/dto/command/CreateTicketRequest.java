package com.app.helpdesk.dto.command;

import com.app.helpdesk.domain.ticketsEnums.Channel;
import com.app.helpdesk.domain.ticketsEnums.Priority;
import com.app.helpdesk.domain.ticketsEnums.Type;

public record CreateTicketRequest (
        String subject,
        String description,
        Priority priority,
        Type type,
        Channel channel
){}
