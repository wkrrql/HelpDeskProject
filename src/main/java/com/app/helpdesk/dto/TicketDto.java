package com.app.helpdesk.dto;


import jakarta.validation.constraints.NotEmpty;

public record TicketDto(
        Long id,

        @NotEmpty(message = "public number shouldn't be empty")
        String publicNumber


) {
}
