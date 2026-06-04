package com.sientenium.demo.model;

import java.time.LocalDateTime;

public class AuditLog {

    private Long logId;
    private Long userId;
    private String entityType;
    private Long entityId;
    private String action;
    private LocalDateTime timestamp;
    private String oldValue;
    private String newValue;

    public AuditLog() {
    }

    public AuditLog(Long logId, Long userId, String entityType, Long entityId, String action, LocalDateTime timestamp, String oldValue, String newValue) {
        this.logId = logId;
        this.userId = userId;
        this.entityType = entityType;
        this.entityId = entityId;
        this.action = action;
        this.timestamp = timestamp;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }
}
