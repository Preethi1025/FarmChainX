package com.FarmChainX.FarmChainX.Controller;

import com.FarmChainX.FarmChainX.Model.ProductBatch;
import com.FarmChainX.FarmChainX.Service.ProductBatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/batches")
public class ProductBatchController {

    @Autowired
    private ProductBatchService batchService;

    @PostMapping("/create")
    public ProductBatch createBatch(@RequestBody ProductBatch batch) {
        return batchService.createBatch(batch);
    }

    @GetMapping("/{id}")
    public ProductBatch getBatch(@PathVariable String id) {
        return batchService.getBatch(id);
    }
}
