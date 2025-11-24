package com.FarmChainX.FarmChainX.Controller;

import com.FarmChainX.FarmChainX.Model.Farmer;
import com.FarmChainX.FarmChainX.Service.FarmerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/farmers")
public class FarmerController {

    @Autowired
    private FarmerService farmerService;

    @PostMapping("/register")
    public Farmer register(@RequestBody Farmer farmer) {
        return farmerService.registerFarmer(farmer);
    }
}
