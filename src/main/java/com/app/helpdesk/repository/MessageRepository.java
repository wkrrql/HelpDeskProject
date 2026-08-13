package com.app.helpdesk.repository;

import com.app.helpdesk.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
