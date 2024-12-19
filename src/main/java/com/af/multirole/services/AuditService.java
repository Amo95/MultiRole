package com.af.multirole.services;

import com.af.multirole.model.AuditLog;
import com.af.multirole.repository.AuditLogRespository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuditService {

    private final AuditLogRespository auditLogRespository;

    public AuditService(AuditLogRespository auditLogRespository) {
        this.auditLogRespository = auditLogRespository;
    }

    public void logUserActivity(String username, String action) {
        AuditLog log = new AuditLog();
        log.setUsername(username);
        log.setAction(action);
        log.setTimestamp(LocalDateTime.now());
        auditLogRespository.save(log);
    }
}
