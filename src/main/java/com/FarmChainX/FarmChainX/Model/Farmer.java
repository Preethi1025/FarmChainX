package com.FarmChainX.FarmChainX.Model;


public class Farmer {
    private String id;
    private String name;
    private String location;
    private String contact;
    private String certifications;

    public Farmer() {}

    public Farmer(String id, String name, String location, String contact, String certifications) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.contact = contact;
        this.certifications = certifications;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
