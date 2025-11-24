package com.FarmChainX.FarmChainX.Service;

import com.FarmChainX.FarmChainX.Model.ProductBatch;
import com.FarmChainX.FarmChainX.Model.TraceRecord;
import com.FarmChainX.FarmChainX.Repository.ProductBatchRepository;
import com.FarmChainX.FarmChainX.Repository.TraceRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TraceRecordService {

    @Autowired
    private ProductBatchRepository batchRepository;

    @Autowired
    private TraceRecordRepository traceRepository;

    public TraceRecord addTraceRecord(String batchId, TraceRecord record) {

        // 1. Load batch
        ProductBatch batch = batchRepository.findById(batchId);
        if (batch == null) {
            throw new RuntimeException("Batch not found: " + batchId);
        }

        // 2. Set trace record values
        record.setId("TRC-" + System.currentTimeMillis());
        record.setBatchId(batchId);
        record.setTimestamp(LocalDateTime.now());

        // 3. Blockchain-style linking
        record.setPrevHash(batch.getLastHash());
        record.setHash(generateHash(record.getPrevHash()));

        // 4. Add to batch trace list
        batch.getTraceRecords().add(record);
        batch.setLastHash(record.getHash());

        // 5. Save updates
        batchRepository.save(batch);
        traceRepository.save(record);

        return record;
    }

    private String generateHash(String input) {
        return Integer.toHexString(input.hashCode());
    }
}
