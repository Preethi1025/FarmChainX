package com.FarmChainX.FarmChainX.Service;

import com.FarmChainX.FarmChainX.Model.Crop;
import com.FarmChainX.FarmChainX.Repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CropService {

    @Autowired
    private CropRepository cropRepository;

    // Add a new crop
    public Crop addCrop(Crop crop) {
        cropRepository.save(crop);
        return crop;
    }

    // Get crop by ID
    public Crop getCrop(String id) {
        return cropRepository.findById(id);
    }
}
