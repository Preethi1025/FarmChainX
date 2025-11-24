package com.FarmChainX.FarmChainX.Service;



import com.FarmChainX.FarmChainX.Model.ProductBatch;
import com.FarmChainX.FarmChainX.Model.TraceRecord;
import com.FarmChainX.FarmChainX.Repository.ProductBatchRepository;
import com.FarmChainX.FarmChainX.Repository.TraceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductBatchService {

    @Autowired
    private ProductBatchRepository batchRepository;

    @Autowired
    private TraceRecordRepository traceRepository;

    public ProductBatch createBatch(ProductBatch batch) {


        TraceRecord genesis = new TraceRecord();
        genesis.setId("REC-" + System.currentTimeMillis());
        genesis.setBatchId(batch.getBatchId());
        genesis.setTimestamp(LocalDateTime.now());
        genesis.setEventType("HARVEST");
        genesis.setDetails("Initial harvest created");
        genesis.setPrevHash("GENESIS");
        genesis.setHash(Integer.toHexString("GENESIS".hashCode()));

        batch.getTraceRecords().add(genesis);
        batch.setLastHash(genesis.getHash());

        batchRepository.save(batch);
        traceRepository.save(genesis);

        return batch;
    }

    public ProductBatch getBatch(String batchId) {
        return batchRepository.findById(batchId);
    }
}
