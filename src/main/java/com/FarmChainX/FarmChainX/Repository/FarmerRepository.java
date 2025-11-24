package com.FarmChainX.FarmChainX.Repository;

import com.FarmChainX.FarmChainX.Model.Farmer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class FarmerRepository {

    private final Map<String, Farmer> farmerDB = new HashMap<>();

    public Farmer save(Farmer farmer) {
        farmerDB.put(farmer.getId(), farmer);
        return farmer;
    }

    public Farmer findById(String id) {
        return farmerDB.get(id);
    }
}
