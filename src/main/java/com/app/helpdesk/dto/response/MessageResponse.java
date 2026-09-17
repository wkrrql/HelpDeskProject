package com.app.helpdesk.dto.response;

public record MessageResponse(
        Long id,
        String content,
        String authorType,
        Long authorId,
        String createdAt
) {}