package com.FarmChainX.FarmChainX.Model;
import java.time.LocalDateTime;

import java.time.LocalDateTime;

public class TraceRecord {
    private String id;
    private String batchId;
    private LocalDateTime timestamp;
    private String actor;
    private String eventType;
    private String location;
    private String details;
    private String prevHash;
    private String hash;

    public TraceRecord() {}

    // --- Getters & Setters ---
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getBatchId() { return batchId; }
    public void setBatchId(String batchId) { this.batchId = batchId; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public String getActor() { return actor; }
    public void setActor(String actor) { this.actor = actor; }

    public String getEventType() { return eventType; }
    public void setEventType(String eventType) { this.eventType = eventType; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }

    public String getPrevHash() { return prevHash; }
    public void setPrevHash(String prevHash) { this.prevHash = prevHash; }

    public String getHash() { return hash; }
    public void setHash(String hash) { this.hash = hash; }
}

