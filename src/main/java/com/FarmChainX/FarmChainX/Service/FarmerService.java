package com.FarmChainX.FarmChainX.Service;

import com.FarmChainX.FarmChainX.Model.Farmer;
import com.FarmChainX.FarmChainX.Repository.FarmerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmerService {

    @Autowired
    private FarmerRepository farmerRepository;

    public Farmer registerFarmer(Farmer farmer) {
        return farmerRepository.save(farmer);
    }

    public Farmer getFarmer(String id) {
        return farmerRepository.findById(id);
    }
}
