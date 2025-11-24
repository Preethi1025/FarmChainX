package com.FarmChainX.FarmChainX.Controller;

import com.FarmChainX.FarmChainX.Model.Crop;
import com.FarmChainX.FarmChainX.Service.CropService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crops")
public class CropController {

    @Autowired
    private CropService cropService;

    @PostMapping("/add")
    public Crop addCrop(@RequestBody Crop crop) {
        return cropService.addCrop(crop);
    }

    @GetMapping("/{id}")
    public Crop getCropById(@PathVariable String id) {
        return cropService.getCrop(id);
    }
}
