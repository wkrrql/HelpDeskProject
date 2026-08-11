package com.app.helpdesk.domain;

import com.app.helpdesk.domain.ticketsEnums.*;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "public_number", nullable = false, unique = true)
    private String publicNumber;

    @Column(name = "subject", nullable = false)
    private String subject;

    @Column(name = "description", nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Enumerated(EnumType.STRING)
    @Column(name = "priority", nullable = false)
    private Priority priority;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private Type type;

    @Enumerated(EnumType.STRING)
    @Column(name = "channel", nullable = false)
    private Channel channel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "requester_ID")
    private Requester requesterID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "agent_ID")
    private Agent agentID;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "organization_ID")
//    private Organization organizationID;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "update_at", nullable = false)
    private LocalDateTime updateAt;

    @Column(name = "first_response_at")
    private LocalDateTime firstResponseAt;

    @Column(name = "solved_at")
    private LocalDateTime solvedAt;

    @PrePersist
    public void defaultData() {
        this.createdAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
        if (this.status == null) {
            this.status = Status.NEW;
        }
    }

    @PreUpdate
    public void setUpdate() {
        this.updateAt = LocalDateTime.now();
    }
}
