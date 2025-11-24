package com.FarmChainX.FarmChainX.Model;
import java.time.LocalDate;

public class Crop {
    private String id;
    private String farmerId;
    private String cropType;
    private LocalDate sowDate;
    private LocalDate expectedHarvestDate;
    private String farmLocation;
    private String soilInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
