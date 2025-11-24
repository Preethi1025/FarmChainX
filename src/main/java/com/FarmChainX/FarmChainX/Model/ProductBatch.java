package com.FarmChainX.FarmChainX.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductBatch {
    private String batchId;
    private String cropId;
    private LocalDate harvestDate;
    private double quantity;
    private String qualitySummary;
    private String currentOwner;
    private String lastHash;

    private List<TraceRecord> traceRecords = new ArrayList<>();

    public ProductBatch() {}

    public String getBatchId() { return batchId; }
    public void setBatchId(String batchId) { this.batchId = batchId; }

    public String getCropId() { return cropId; }
    public void setCropId(String cropId) { this.cropId = cropId; }

    public LocalDate getHarvestDate() { return harvestDate; }
    public void setHarvestDate(LocalDate harvestDate) { this.harvestDate = harvestDate; }

    public double getQuantity() { return quantity; }
    public void setQuantity(double quantity) { this.quantity = quantity; }

    public String getQualitySummary() { return qualitySummary; }
    public void setQualitySummary(String qualitySummary) { this.qualitySummary = qualitySummary; }

    public String getCurrentOwner() { return currentOwner; }
    public void setCurrentOwner(String currentOwner) { this.currentOwner = currentOwner; }

    public String getLastHash() { return lastHash; }
    public void setLastHash(String lastHash) { this.lastHash = lastHash; }

    public List<TraceRecord> getTraceRecords() { return traceRecords; }
    public void setTraceRecords(List<TraceRecord> traceRecords) { this.traceRecords = traceRecords; }
}
