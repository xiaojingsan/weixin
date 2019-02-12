package com.example.library.service.impl;

import com.example.library.service.TestDataService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Service;

@Service
public class TestDataServiceImpl extends EchartReportServiceImpl implements TestDataService {
    @Override
    public JSONPObject getDataJson() {
        return null;
    }
}
