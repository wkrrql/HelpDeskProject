package com.app.helpdesk.mapper;

import com.app.helpdesk.domain.ticketsEnums.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StatusMapper {

    public String mapStatusForClient(Status status) {
        if (status == null) return null;
        return switch (status) {
            case NEW -> "Принято";
            case OPEN -> "В работе";
            case PENDING -> "Ждём вас";
            case ON_HOLD -> "На удержании";
            case SOLVED -> "Решено";
            case CLOSED -> "Закрыто";
        };
    }
}