package com.immortalcrab.cfdi.processor;

import com.immortalcrab.cfdi.errors.EngineError;
import com.immortalcrab.cfdi.processor.Processor.IStamp;

import java.util.Map;

public class PacSapienStamp implements IStamp<PacReply> {

    @Override
    public PacReply impress(Map<String, Object> pacReq) throws EngineError {

        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static PacSapienStamp setup(final String name, final String user, final String passwd) {

        // It is still pending to add code here
        return new PacSapienStamp();
    }
}
