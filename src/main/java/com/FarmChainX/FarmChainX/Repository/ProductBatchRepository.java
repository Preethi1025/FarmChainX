package com.FarmChainX.FarmChainX.Repository;

import com.FarmChainX.FarmChainX.Model.ProductBatch;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductBatchRepository {

    private final Map<String, ProductBatch> batchDB = new HashMap<>();

    public ProductBatch save(ProductBatch batch) {
        batchDB.put(batch.getBatchId(), batch);
        return batch;
    }

    public ProductBatch findById(String id) {
        return batchDB.get(id);
    }
}
