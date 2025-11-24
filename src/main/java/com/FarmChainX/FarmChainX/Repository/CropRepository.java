package com.FarmChainX.FarmChainX.Repository;

import com.FarmChainX.FarmChainX.Model.Crop;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CropRepository {

    private final Map<String, Crop> cropDB = new HashMap<>();

    public Crop save(Crop crop) {
        cropDB.put(crop.getId(), crop);
        return crop;
    }

    public Crop findById(String id) {
        return cropDB.get(id);
    }
}

