package com.FarmChainX.FarmChainX.Repository;

import com.FarmChainX.FarmChainX.Model.TraceRecord;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TraceRecordRepository {

    private final Map<String, TraceRecord> traceDB = new HashMap<>();

    public TraceRecord save(TraceRecord record) {
        traceDB.put(record.getId(), record);
        return record;
    }
}
