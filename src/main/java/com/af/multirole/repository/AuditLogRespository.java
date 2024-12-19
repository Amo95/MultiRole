package com.af.multirole.repository;

import com.af.multirole.model.AuditLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuditLogRespository extends JpaRepository<AuditLog, Long> {
}
