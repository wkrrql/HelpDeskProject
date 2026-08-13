package com.app.helpdesk.repository;

import com.app.helpdesk.domain.Requester;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequesterRepository extends JpaRepository<Requester, Long> {
}
