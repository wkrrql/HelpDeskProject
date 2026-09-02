package com.app.helpdesk.dto;

public record MessageDto(
        Long id,
        String content,
        String authorType,
        Long authorId,
        String createdAt
) {}